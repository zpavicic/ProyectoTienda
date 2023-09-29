package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityFunkosUser extends AppCompatActivity {

    private TextView textViewVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funkos_user);

        textViewVolver = (TextView) findViewById(R.id.textViewVolver);

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityFunkosUser.this, ActivityHomeUser.class);
                startActivity(intent);
            }
        });
    }
}