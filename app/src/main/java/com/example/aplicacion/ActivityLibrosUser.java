package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityLibrosUser extends AppCompatActivity {

    private TextView textViewVolver;
    private ImageView imageViewProducto, imageViewProducto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_user);

        textViewVolver = (TextView) findViewById(R.id.textViewVolver);
        imageViewProducto = (ImageView) findViewById(R.id.imageViewProducto);
        imageViewProducto2 = (ImageView) findViewById(R.id.imageViewProducto2);

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(ActivityLibrosUser.this, ActivityHomeUser.class);
                startActivity(volver);
            }
        });


        imageViewProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ActivityLibrosUser.this, ActivityProduct.class);
                startActivity(move);
            }
        });
    }
}