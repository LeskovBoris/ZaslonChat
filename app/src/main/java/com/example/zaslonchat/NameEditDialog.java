package com.example.zaslonchat;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import org.jetbrains.annotations.NotNull;

public class NameEditDialog extends DialogFragment implements DialogInterface.OnCancelListener {
    EditText input;
    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        input = new EditText(getContext());
        return  builder.setView(R.layout.edit_name).
                setIcon(R.drawable.zaslon).
                setPositiveButton(R.string.ok, null).
                setNegativeButton(R.string.cancel, null).create();
    }
}
