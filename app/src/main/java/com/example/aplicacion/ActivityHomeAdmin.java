package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityHomeAdmin extends AppCompatActivity {

    private TextView textViewSalir;
    private ConstraintLayout bannerCategoria;

    private Button buttonAddCategoria;
    private ConstraintLayout bannerCategoria2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);

        textViewSalir = (TextView) findViewById(R.id.textViewSalir);
        bannerCategoria = (ConstraintLayout) findViewById(R.id.bannerCategoria);
        bannerCategoria2 = (ConstraintLayout) findViewById(R.id.bannerCategoria2);
        buttonAddCategoria = (Button) findViewById(R.id.buttonAddCategoria);

        textViewSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityHomeAdmin.this, "Has cerrado tu sesión, hasta luego!", Toast.LENGTH_SHORT).show();
                Intent logout = new Intent(ActivityHomeAdmin.this, ActivityLogin.class);
                startActivity(logout);
            }
        });

        buttonAddCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ActivityHomeAdmin.this, ActivityFormCategoria.class);
                startActivity(move);
            }
        });

        bannerCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent funkos = new Intent(ActivityHomeAdmin.this, ActivityFunkosAdmin.class);
                startActivity(funkos);
            }
        });

        bannerCategoria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libros = new Intent(ActivityHomeAdmin.this, ActivityLibrosAdmin.class);
                startActivity(libros);
            }
        });
    }
}