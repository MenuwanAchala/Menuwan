package com.nibm.assesment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson1 extends AppCompatActivity {
    Button btnL1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson1);

        btnL1=findViewById(R.id.btnL1);
        btnL1.setOnClickListener(
                view-> {
                    Toast.makeText(Lesson1.this,"Welcome to Lesson 1!!!",Toast.LENGTH_SHORT).show();
                }
        );

    }
}