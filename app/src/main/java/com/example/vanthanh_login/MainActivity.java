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

public class MainActivity extends AppCompatActivity {
    TextView txt_register;
    TextView tvResult;
    Button btnLogin;
    EditText gmail,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt_register  = findViewById(R.id.txt_register);
        txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(MainActivity.this, register.class);
                startActivity(MyIntent);
            }
        });
        tvResult = findViewById(R.id.tv_result);
        btnLogin = findViewById(R.id.btnLogin);
        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = gmail.getText().toString();
                String pass = password.getText().toString();
                tvResult.setText("Mã sinh viên:"+ email + "\nTên sinh viên:" +pass);
            }
        });
    }
}