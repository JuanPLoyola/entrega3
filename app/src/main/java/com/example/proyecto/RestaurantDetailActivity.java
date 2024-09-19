package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        // Encuentra el botón de imagen del primer producto (hamburguesa de carne)
        ImageButton producto1 = findViewById(R.id.producto1);

        // Establecer un OnClickListener para redirigir a otra actividad al hacer clic en el producto
        producto1.setOnClickListener(view -> {
            Intent intent = new Intent(RestaurantDetailActivity.this, producto.class);
            startActivity(intent);
        });
    }
}