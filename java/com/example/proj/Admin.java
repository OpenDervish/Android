package com.example.proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;

public class Admin extends AppCompatActivity {
    private Button aLogin;
    private EditText user;
    private EditText passwd;

    private Button pSwap;
    private Button dSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    Bundle userBundle = new Bundle();

    public void moveDoctor(View view)
    {
        Intent intent = new Intent(this, Doctor.class);
        intent.putExtras(userBundle);
        startActivity(intent);
    }

    public void movePatient(View view)
    {
        Intent intent = new Intent(this, Patient.class);
        intent.putExtras(userBundle);
        startActivity(intent);
    }

    //    public void login(View view)
//    {
//        Intent intent = new Intent(this, A.class);
//        intent.putExtras(userBundle);
//        startActivity(intent);
//    }
}