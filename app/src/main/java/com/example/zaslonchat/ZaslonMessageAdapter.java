package com.example.zaslonchat;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class ZaslonMessageAdapter extends ArrayAdapter<ZaslonMessage> {
    public ZaslonMessageAdapter(Context context, int resource,
                                List<ZaslonMessage> messages) {
        super(context, resource, messages);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        if (convertView == null) {
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.message_item, parent, false);
        }

        ImageView photoImageVIew = convertView.findViewById(R.id.photoImageView);
        TextView textTextView = convertView.findViewById(R.id.texTextView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);

        ZaslonMessage message = getItem(position);

        boolean isText = message.getImageUrl() == null;

        if(isText) {
            textTextView.setVisibility(View.GONE);
            photoImageVIew.setVisibility(View.INVISIBLE);

            textTextView.setText(message.getText());
        } else{

            textTextView.setVisibility(View.GONE);
            photoImageVIew.setVisibility(View.VISIBLE);

            Glide.with(photoImageVIew.getContext()).load(message.getImageUrl()).into(photoImageVIew);
        }

        nameTextView.setText(message.getName());

        return convertView;
    }
}
