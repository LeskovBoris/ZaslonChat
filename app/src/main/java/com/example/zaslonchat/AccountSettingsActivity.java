package com.example.zaslonchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class AccountSettingsActivity extends AppCompatActivity {

    private TextView nameTextVIew;
    private ImageView avatarImageView;
    private ImageButton addPhotoImageButton;
    private ImageButton editNameImageButton;

    private FirebaseStorage storage;
    private StorageReference avatarImagesStorageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        nameTextVIew = findViewById(R.id.nameTextView);
        avatarImageView = findViewById(R.id.avatarImageView);
        addPhotoImageButton = findViewById(R.id.addPhotoImageButton);
        editNameImageButton = findViewById(R.id.editNameImageButton);


    }


}