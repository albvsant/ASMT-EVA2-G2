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
                int idItemMenu = item.getItemId();
                if(idItemMenu ==R.id.menu_datos)
                {
                    Toast.makeText(MainActivity.this, "Datos sensados", Toast.LENGTH_SHORT).show();
                    return true;
                }else if(idItemMenu == R.id.menu_bateria)
                {
                    Toast.makeText(MainActivity.this, "Estado de Batería del Prototipo", Toast.LENGTH_SHORT).show();
                    return true;
                }else
                {
                    return false;
                }
            }
        });

        popupMenu.show();
    }
}