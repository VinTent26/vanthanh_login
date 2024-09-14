package com.example.vanthanh_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {
    TextView txt_exist;
    TextView tvResult;
    EditText gmail, password, user;
    Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt_exist  = findViewById(R.id.txt_exist);
        txt_exist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        user = findViewById(R.id.user);
        tvResult = findViewById(R.id.tv_result);
        btnregister = findViewById(R.id.btnRegiter);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = gmail.getText().toString();
                String name = user.getText().toString();
                String pass = password.getText().toString();
                tvResult.setText("Mã sinh viên:"+ email + "\nTên sinh viên:" +name + "\nmail: " +pass );
            }
        });

    }
}