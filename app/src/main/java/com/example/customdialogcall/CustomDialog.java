package com.example.customdialogcall;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class CustomDialog extends DialogFragment {

    private TextView okay, username, attempt, note;
    private String message;

    public static CustomDialog newInstance(String message) {
        CustomDialog dialog = new CustomDialog();
        Bundle args = new Bundle();
        args.putString("message", message);
        dialog.setArguments(args);
        return dialog;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext(), R.style.dialog);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.dialog_bg);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_popup_dialog, container, false);

        // Initialize UI components
        okay = itemView.findViewById(R.id.okayPopup);
        username = itemView.findViewById(R.id.popUp_userName);
        attempt = itemView.findViewById(R.id.attempts);
        note = itemView.findViewById(R.id.note);

        username.setText("Anush");

        if (getArguments() != null) {
            message = getArguments().getString("message");
            setDialogText(message);
        }

        return itemView;
    }




    private void setDialogText(String message) {
        if (message.equals("first custom message!")) {
            handleFirstOkayClick();
        } else if (message.equals("second custom message!")) {
            handleSecondOkayClick();
        } else if (message.equals("third custom message!")) {
            handleThirdOkayClick();
        }
    }

    private void handleFirstOkayClick() {
        attempt.setText("#1");
        note.setTextColor(Color.parseColor("#FF76FF03"));
        note.setText("NOTE: This is Custom Dialog");
        okay.setText("Okay");
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissAllowingStateLoss();
            }
        });
    }

    private void handleSecondOkayClick() {
        attempt.setText("#2");
        note.setTextColor(Color.parseColor("#FF00E5FF"));
        note.setText("NOTE: You can apply any theme");
        okay.setText("Okay");
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissAllowingStateLoss();
            }
        });
    }

    private void handleThirdOkayClick() {
        attempt.setText("#3");
        note.setTextColor(Color.parseColor("#FD9726"));
        note.setText("NOTE: You can change any color you want");
        okay.setText("Okay");
        okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissAllowingStateLoss();
            }
        });
    }

}
