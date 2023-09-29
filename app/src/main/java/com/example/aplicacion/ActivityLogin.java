package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private ImageView loginButton;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        loginButton = (ImageView) findViewById(R.id.loginButton);
        textView2 = (TextView) findViewById(R.id.textView2);




        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextEmail.getText().toString().equals("user")){
                    Intent loguearUser = new Intent(ActivityLogin.this, ActivityHomeUser.class);
                    startActivity(loguearUser);
                } else if (editTextEmail.getText().toString().equals("admin")) {
                    Intent loguearAdmin = new Intent(ActivityLogin.this, ActivityHomeAdmin.class);
                    startActivity(loguearAdmin);
                } else {
                    Toast.makeText(ActivityLogin.this, "Usuario y/o contraseña incorrecto!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regist = new Intent(ActivityLogin.this, ActivitySignup.class);
                startActivity(regist);
            }
        });

    }
}