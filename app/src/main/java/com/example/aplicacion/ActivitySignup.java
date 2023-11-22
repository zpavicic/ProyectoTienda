package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

public class ActivitySignup extends AppCompatActivity {

    private EditText etUsername;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private ImageView signUpButton;
    private TextView tvVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        signUpButton = (ImageView) findViewById(R.id.signUpButton);
        tvVolver = (TextView) findViewById(R.id.tvVolver);

        tvVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(ActivitySignup.this, ActivityLogin.class);
                startActivity(regresar);
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newUser();
            }
        });
    }

    private void newUser() {

        User u = new User();

        u.setUid(UUID.randomUUID().toString());
        u.setNombre(etUsername.getText().toString());
        u.setCorreo(etEmail.getText().toString());
        u.setPassword(etPassword.getText().toString());
        u.makeUser(u);

        if (u.getUid().isEmpty() || u.getNombre().isEmpty() || u.getCorreo().isEmpty() || u.getPassword().isEmpty()){
            Toast.makeText(ActivitySignup.this, "Por favor rellena todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            // Database.child("Persona").child(p.getUid()).setValue(p);
            Database.saveUser(u, this);
            Toast.makeText(this, "Persona registrada exitosamente", Toast.LENGTH_SHORT).show();

            etUsername.setText("");
            etEmail.setText("");
            etPassword.setText("");
            etConfirmPassword.setText("");
        }

    }
}