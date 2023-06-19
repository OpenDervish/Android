package com.example.proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;

public class Doctor extends AppCompatActivity {
    private Button dLogin;
    private EditText user;
    private EditText passwd;

    private Button pSwap;
    private Button aSwap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    Bundle userBundle = new Bundle();
    public void moveAdmin(View view)
    {
        Intent intent = new Intent(this, Admin.class);
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
//        Intent intent = new Intent(this, D.class);
//        intent.putExtras(userBundle);
//        startActivity(intent);
//    }
}