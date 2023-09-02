package com.example.amst_eva2_g2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_vertical, popupMenu.getMenu());

        // Agregar un oyente de clic para los elementos del menú
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_datos: // Cambia a R.id.menu_datos
                        // Lógica para la opción 1
                        Toast.makeText(MainActivity.this, "Opción 1 seleccionada", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_bateria:
                        // Lógica para la opción 2
                        Toast.makeText(MainActivity.this, "Opción 2 seleccionada", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });

        popupMenu.show();
    }
}