package com.example.android.homework15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.switch_mode_btn);
        final View mathBar = findViewById(R.id.main_bar);
        final View engineerBar = findViewById(R.id.engineer_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mathBar.getVisibility() == View.VISIBLE){
                    mathBar.setVisibility(View.GONE);
                    engineerBar.setVisibility(View.VISIBLE);
                    button.setText(R.string.engeneer_mode);
                } else {
                    mathBar.setVisibility(View.VISIBLE);
                    engineerBar.setVisibility(View.GONE);
                    button.setText(R.string.normal_mode);
                }
            }
        });

        final TextView textView = findViewById(R.id.textView);
        Button button0 = findViewById(R.id.btn0);
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button buttonComma = findViewById(R.id.commaBtn);
        Button buttonC = findViewById(R.id.btnC);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "";
                textView.setText(number);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._0));
                textView.setText(number);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._1));
                textView.setText(number);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._2));
                textView.setText(number);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._3));
                textView.setText(number);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._4));
                textView.setText(number);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._5));
                textView.setText(number);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._6));
                textView.setText(number);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._7));
                textView.setText(number);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._8));
                textView.setText(number);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string._9));
                textView.setText(number);
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number.concat(getString(R.string.comma));
                textView.setText(number);
            }
        });

    }
}