package com.example.zaslonchat;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.jetbrains.annotations.NotNull;

import static androidx.constraintlayout.widget.StateSet.TAG;

public class AccountSettingsActivity extends AppCompatActivity {

    private String userName;

    private TextView nameTextVIew;
    private ImageView avatarImageView;
    private ImageButton addPhotoImageButton;
    private ImageButton editNameImageButton;

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private DatabaseReference usersDatabaseReference;
    private DatabaseReference nameDatabaseReference;
    private ChildEventListener userChildEventListener;
    private FirebaseStorage storage;
    private StorageReference avatarImagesStorageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        database = FirebaseDatabase.getInstance();



        nameTextVIew = findViewById(R.id.nameTextView);
        avatarImageView = findViewById(R.id.avatarImageView);
        addPhotoImageButton = findViewById(R.id.addPhotoImageButton);
        editNameImageButton = findViewById(R.id.editNameImageButton);

        Intent intent = getIntent();


        auth = FirebaseAuth.getInstance();

        getCurrentName();



    }

    private void getCurrentName() {

      usersDatabaseReference = database.getReference().child("users").child(auth.getUid());

      usersDatabaseReference.addValueEventListener(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
              User user = new User();
              user = snapshot.getValue(User.class);
              nameTextVIew.setText("Your name: " + user.getName());
          }

          @Override
          public void onCancelled(@NonNull @NotNull DatabaseError error) {

          }
      });
    }


    public void cLickEditName(View view) {
        NameEditDialog nameEdit = new NameEditDialog();
        nameEdit.show(getSupportFragmentManager(), "custom");
    }










}