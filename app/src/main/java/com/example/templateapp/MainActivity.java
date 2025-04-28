package com.example.templateapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText inputField;
    private TextView result1;
    private TextView result2;
    private LinearLayout resultsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = findViewById(R.id.inputField);
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        resultsContainer = findViewById(R.id.resultsContainer);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button resetButton = findViewById(R.id.resetButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputField.getText().toString();
                result1.setText("Hasil 1: " + input);
                resultsContainer.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputField.getText().toString();
                result2.setText("Hasil 2: " + input);
                resultsContainer.setVisibility(View.VISIBLE);
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText("");
                result2.setText("");
                inputField.setText("");
                resultsContainer.setVisibility(View.GONE);
            }
        });
    }
}
