package com.nibm.assesment1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button lesson1,lesson2,lesson3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lesson1=findViewById(R.id.lesson1);
        lesson1.setOnClickListener(
                view-> {
                    Intent intent = new Intent(MainActivity.this, Lesson1.class);
                    startActivity(intent);
                }
        );


        lesson2=findViewById(R.id.lesson2);
        lesson2.setOnClickListener(
                view-> {
                    Intent intent = new Intent(MainActivity.this, Lesson2.class);
                    startActivity(intent);
                }
        );


        lesson3=findViewById(R.id.lesson3);
        lesson3.setOnClickListener(
                view-> {
                    Intent intent = new Intent(MainActivity.this, Lesson3.class);
                    startActivity(intent);
                }
        );


    }
}