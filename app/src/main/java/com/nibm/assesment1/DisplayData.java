package com.nibm.assesment1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayData extends AppCompatActivity {
    TextView txtData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_data);

        txtData = findViewById(R.id.txtData);

        String Name =getIntent().getStringExtra("Name");
        String Email =getIntent().getStringExtra("Email");
        String Mobile_Number =getIntent().getStringExtra("Mobile_Number");


        txtData.setText(
                "Name :"+Name+"\nEmail :"+Email+"\nMobile_Number :"+ Mobile_Number);

    }
}