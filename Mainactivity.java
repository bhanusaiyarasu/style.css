package com.example.checkboxapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.checkboxexp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI elements
        CheckBox checkBoxJava = findViewById(R.id.checkBoxJava);
        CheckBox checkBoxPython = findViewById(R.id.checkBoxPython);
        CheckBox checkBoxC = findViewById(R.id.checkBoxC);
        Button submitButton = findViewById(R.id.submitButton);
        // Handling button click event
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder("Selected: ");

                if (checkBoxJava.isChecked()) {
                    result.append("Java ");
                }

                if (checkBoxPython.isChecked()) {
                    result.append("Python ");
                }

                if (checkBoxC.isChecked()) {
                    result.append("C++ ");
                }

                if (result.toString().equals("Selected: ")) {
                    result.append("None");
                }

                // Displaying selected options using Toast
                Toast.makeText(getApplicationContext(), result.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}