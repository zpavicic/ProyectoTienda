package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFunkosAdmin extends AppCompatActivity {

    private Button buttonAdd;
    private TextView textViewVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkos_admin);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        textViewVolver = (TextView) findViewById(R.id.textViewVolver);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(ActivityFunkosAdmin.this, ActivityProductForm.class);
                startActivity(add);
            }
        });

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(ActivityFunkosAdmin.this, ActivityHomeAdmin.class);
                startActivity(volver);
            }
        });
    }
}