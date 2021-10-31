package com.example.calculatorptudctbdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btnDivide;
    private TextView btnMinus;
    private TextView btnPlusAndMinus;
    private TextView btnBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        String DIVIDE_SYMBOL = "\u00F7";
        btnDivide.setText(DIVIDE_SYMBOL);
        String MINUS_SYMBOL = "\u2212";
        btnMinus.setText(MINUS_SYMBOL);
        String PLUS_AND_MINUS_SYMBOL = "\u00B1";
        btnPlusAndMinus.setText(PLUS_AND_MINUS_SYMBOL);
        String BACKSPACE_SYMBOL = "\u232B";
        btnBackspace.setText(BACKSPACE_SYMBOL);
    }

    private void mapping() {
        btnDivide = findViewById(R.id.button_divide);
        btnMinus = findViewById(R.id.button_minus);
        btnPlusAndMinus = findViewById(R.id.button_plus_and_minus);
        btnBackspace = findViewById(R.id.button_backspace);
    }

}