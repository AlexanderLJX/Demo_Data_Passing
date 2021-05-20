package com.id20048076.demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DoubleActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);

        tv = findViewById(R.id.textView2);
        Intent i = getIntent();
        double d = i.getDoubleExtra("double",0.0);
        tv.setText("Double value received is: " + d);

    }
}