package com.example.customdialogcall;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Show the dialog with different texts
        findViewById(R.id.show_dialog_button).setOnClickListener(v -> {
            String message = "first custom message!";
            CustomDialog customDialog = CustomDialog.newInstance(message);
            customDialog.setCancelable(false);
            customDialog.show(getSupportFragmentManager(), "PopUpDialog");
        });

        findViewById(R.id.show_dialog_button_2).setOnClickListener(v -> {
            String message = "second custom message!";
            CustomDialog customDialog = CustomDialog.newInstance(message);
            customDialog.setCancelable(false);
            customDialog.show(getSupportFragmentManager(), "PopUpDialog");
        });

        findViewById(R.id.show_dialog_button_3).setOnClickListener(v -> {
            String message = "third custom message!";
            CustomDialog customDialog = CustomDialog.newInstance(message);
            customDialog.setCancelable(false);
            customDialog.show(getSupportFragmentManager(), "PopUpDialog");
        });

    }
}