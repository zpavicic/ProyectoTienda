package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityHomeUser extends AppCompatActivity {

    private TextView textViewSalir;
    private ConstraintLayout seccionLibros;
    private ConstraintLayout bannerCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);

        textViewSalir = (TextView) findViewById(R.id.textViewSalir);
        bannerCategoria = (ConstraintLayout) findViewById(R.id.bannerCategoria);
        seccionLibros = (ConstraintLayout) findViewById(R.id.seccionLibros);

        textViewSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(ActivityHomeUser.this, ActivityLogin.class);
                startActivity(logout);
            }
        });

        bannerCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent funkos = new Intent(ActivityHomeUser.this, ActivityFunkosUser.class);
                startActivity(funkos);
            }
        });

        seccionLibros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libros = new Intent(ActivityHomeUser.this, ActivityLibrosUser.class);
                startActivity(libros);
            }
        });
    }
}