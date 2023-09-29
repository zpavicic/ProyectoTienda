package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFormCategoria extends AppCompatActivity {

    private TextView textViewVolver;
    private Button btnCrear;

    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_categoria);

        textViewVolver = (TextView) findViewById(R.id.textViewVolver);
        btnCrear = (Button) findViewById(R.id.btnCrear);
        etNombre = (EditText) findViewById(R.id.etNombre);

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(ActivityFormCategoria.this, ActivityHomeAdmin.class);
                startActivity(volver);
            }
        });

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre_categoria = etNombre.getText().toString();

                Toast.makeText(ActivityFormCategoria.this, "La categoria " + nombre_categoria + " ha sido creada", Toast.LENGTH_SHORT).show();
                Intent ok = new Intent(ActivityFormCategoria.this, ActivityHomeAdmin.class);
                startActivity(ok);
            }
        });
    }
}