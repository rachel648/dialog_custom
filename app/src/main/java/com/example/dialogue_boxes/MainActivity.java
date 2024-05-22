package com.example.dialogue_boxes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.cardview1);
        cardView1.setOnClickListener(v -> showCustomDialog("Button 1 Clicked"));

        CardView cardView2 = findViewById(R.id.cardview2);
        cardView2.setOnClickListener(v -> showCustomDialog("Button 2 Clicked"));

        // Repeat for other CardViews or use a loop if you have many CardViews.
    }

    private void showCustomDialog(String message) {
        Dialog dialog = new Dialog(this);
        View view = LayoutInflater.from(this).inflate(R.layout.activity_dialog_custom, null);
        dialog.setContentView(view);

        TextView dialogTitle = view.findViewById(R.id.dialog_title);
        TextView dialogMessage = view.findViewById(R.id.dialog_message);
        Button dialogButton = view.findViewById(R.id.dialog_button);

        dialogTitle.setText("Custom Dialog");
        dialogMessage.setText(message);

        dialogButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}