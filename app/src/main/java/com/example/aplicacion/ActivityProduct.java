package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.aplicacion.User;

public class ActivityProduct extends AppCompatActivity {
    
    private TextView textViewVolver;
    
    private Button btnAgregar;

    public User user1 = new User("zeljko", "pavicic", 21, "cliente");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        
        textViewVolver = (TextView) findViewById(R.id.textViewVolver);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);

        textViewVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(ActivityProduct.this, ActivityLibrosUser.class);
                startActivity(regr);
            }
        });
        
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityProduct.this, "Producto agregado a tu carrito", Toast.LENGTH_SHORT).show();
                Intent agregarAdmin = new Intent(ActivityProduct.this, ActivityLibrosAdmin.class);
                Intent agregarUser = new Intent(ActivityProduct.this, ActivityLibrosUser.class);
                if(user1.getRole().equals("admin")){
                    startActivity(agregarAdmin);
                } else {
                    startActivity(agregarUser);
                }
            }
        });
    }
}