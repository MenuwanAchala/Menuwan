package com.nibm.assesment1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson3);

        FragmentA fragmentA=new FragmentA();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.act3,
                        fragmentA
                )
                .commit();

    }
}