package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityLibrosAdmin extends AppCompatActivity {

    private TextView textViewVolver;
    private Button buttonAdd;
    private ImageView imageViewProducto, imageViewProducto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_admin);

        textViewVolver = (TextView) findViewById(R.id.textViewVolver);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        imageViewProducto = (ImageView) findViewById(R.id.imageViewProducto);
        imageViewProducto2 = (ImageView) findViewById(R.id.imageViewProducto2);

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(ActivityLibrosAdmin.this, ActivityHomeAdmin.class);
                startActivity(volver);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent agregar = new Intent(ActivityLibrosAdmin.this, ActivityProductForm.class);
                startActivity(agregar);
            }
        });

        imageViewProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(ActivityLibrosAdmin.this, ActivityProduct.class);
                startActivity(move);
            }
        });
    }
}