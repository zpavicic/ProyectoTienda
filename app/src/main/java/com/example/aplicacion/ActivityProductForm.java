package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityProductForm extends AppCompatActivity {

    private Button buttonAdd;
    private TextView textViewVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_form);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        textViewVolver = (TextView) findViewById(R.id.textViewVolver);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityProductForm.this, "Producto agregado exitosamente", Toast.LENGTH_SHORT).show();
                Intent regresar = new Intent(ActivityProductForm.this, ActivityFunkosAdmin.class);
                startActivity(regresar);
            }
        });

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(ActivityProductForm.this, ActivityFunkosAdmin.class);
                startActivity(regr);
            }
        });
    }
}