package com.example.proyecto;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class PedidoExitosoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_exitoso);

        // Usar un Handler para cerrar la actividad después de 3 segundos
        new Handler().postDelayed(() -> {
            // Finaliza la actividad "Pedido Exitoso"
            finish();

            // Si quieres regresar a una actividad previa específica, usa un Intent aquí
            Intent intent = new Intent(PedidoExitosoActivity.this, MainActivity.class);  // Vuelve a MainActivity, por ejemplo
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);  // Limpia las actividades anteriores
            startActivity(intent);

        }, 2500);  // 3000 milisegundos = 3 segundos
    }
}