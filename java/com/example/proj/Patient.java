package com.example.proj;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class Patient extends AppCompatActivity {

    private Button pLogin;
    private EditText user;
    private EditText passwd;

    private Button aSwap;
    private Button dSwap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Bundle userBundle = new Bundle();
//    public void login(View view)
//    {
//        Intent intent = new Intent(this, P.class);
//        intent.putExtras(userBundle);
//        startActivity(intent);
//    }

    public void moveAdmin(View view)
    {
        Intent intent = new Intent(this, Admin.class);
        intent.putExtras(userBundle);
        startActivity(intent);
    }

    public void moveDoctor(View view)
    {
        Intent intent = new Intent(this, Doctor.class);
        intent.putExtras(userBundle);
        startActivity(intent);
    }
}