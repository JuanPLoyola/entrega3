package com.example.proyecto;

import android.content.Intent;
import android.os.Handler;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

    Button buttonPagar = findViewById(R.id.button_pagar);

    // Evento click del botón "Pagar"
        buttonPagar.setOnClickListener(view -> {
        // Mostrar la pantalla de "Pedido Exitoso" durante 3 segundos
        Intent intent = new Intent(CartActivity.this, PedidoExitosoActivity.class);
        startActivity(intent);

        // Usar Handler para retrasar la finalización de la actividad
        new Handler().postDelayed(() -> {
            // Finaliza la actividad después de 3 segundos (regresa automáticamente a la pantalla anterior)
            finish();
        }, 2500);  // 1000 milisegundos = 3 segundos
    });
}
}