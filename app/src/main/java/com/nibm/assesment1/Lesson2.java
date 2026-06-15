package com.nibm.assesment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson2 extends AppCompatActivity {
    Button btnSubmit,btnClear;
    EditText edtName,edtMobile,edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson2);

        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtMobile=findViewById(R.id.edtMobile);

        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(
                v -> {
                    if(edtName.getText().toString().isEmpty())
                    {
                        Toast.makeText(Lesson2.this,"Enter Name!!!",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (edtEmail.getText().toString().isEmpty())
                    {
                        Toast.makeText(Lesson2.this,"Enter Email!!!",Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (edtMobile.getText().toString().isEmpty())
                    {
                        Toast.makeText(Lesson2.this,"Enter Mobile Number!!!",Toast.LENGTH_SHORT).show();
                        return;
                    }


                    Intent intent=new Intent(Lesson2.this, DisplayData.class);
                    intent.putExtra("Name",edtName.getText().toString());
                    intent.putExtra("Email",edtEmail.getText().toString());
                    intent.putExtra("Mobile_Number",edtMobile.getText().toString());
                    startActivity(intent);


                }
        );

        btnClear=findViewById(R.id.btnClear);
        btnClear.setOnClickListener(
                v -> {
                    edtName.setText("");
                    edtEmail.setText("");
                    edtMobile.setText("");
                }
        );

    }
}