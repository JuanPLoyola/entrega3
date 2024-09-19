package com.example.proyecto;

import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class producto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        Button button_add = findViewById(R.id.button_add);
        // Redireccionar al carrito
        button_add.setOnClickListener(view -> {
            Intent intent = new Intent(producto.this, CartActivity.class);
            startActivity(intent);
        });
    }
}