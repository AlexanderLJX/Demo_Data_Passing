package com.id20048076.demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(MainActivity.this, IntegerActivity.class);
                intent.putExtra("integer", 1);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(MainActivity.this, CharacterActivity.class);
                intent.putExtra("character", 'a');
                startActivity(intent);
            }
        });
//        tv.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, CharacterActivity.class);
//                intent.putExtra("double", 99.99);
//                startActivity(intent);
//            }
//        });
    }
    public void onClick(View view){
        Intent intent = new Intent(MainActivity.this, DoubleActivity.class);
        intent.putExtra("double", 99.99);
        startActivity(intent);
    }
}