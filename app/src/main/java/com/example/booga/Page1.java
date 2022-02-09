package com.example.booga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Page1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        EditText editText = (EditText)findViewById(R.id.simpleEditText);
        editText.setText("Username");

        Intent receiveIntent = getIntent();
        String message = receiveIntent.getStringExtra("Message");
    }
}