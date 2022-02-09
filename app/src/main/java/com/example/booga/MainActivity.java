package com.example.booga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.btn).setOnClickListener(buttonClickListener);
        findViewById(R.id.btn1).setOnClickListener(buttonClickListener);
        findViewById(R.id.btn2).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn:
                    startActivity(new Intent(MainActivity.this, Page.class));
                    break;
                case R.id.btn1:
                    startActivity(new Intent(MainActivity.this, Page1.class));
                    break;
                case R.id.btn2:
                    startActivity(new Intent(MainActivity.this, Page2.class));
                    break;

            }
        }
    };
}