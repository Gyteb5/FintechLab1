package com.example.fintechlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textViewMain = findViewById(R.id.textViewMain);
    }

    public void OnClickHere(View view) {
        this.textViewMain.setText("Text was changed!");
    }


    public void OnChangeColor(View view) {
        this.textViewMain.setTextColor(Color.RED);
}
}
