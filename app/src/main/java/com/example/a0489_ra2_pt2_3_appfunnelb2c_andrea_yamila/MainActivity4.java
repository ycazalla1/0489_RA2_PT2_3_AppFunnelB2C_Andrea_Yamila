package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    private ToggleButton btnAccion, btnRomance, btnFantasia, btnSlice, btnTerror, btnShonen, btnShojo, btnMecha;
    private Button btnContinu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Referencias a los ToggleButton
        btnAccion = findViewById(R.id.btn_accion);
        btnRomance = findViewById(R.id.btn_romance);
        btnFantasia = findViewById(R.id.btn_fantasia);
        btnSlice = findViewById(R.id.btn_slice);
        btnTerror = findViewById(R.id.btn_terror);
        btnShonen = findViewById(R.id.btn_shonen);
        btnShojo = findViewById(R.id.btn_shojo);
        btnMecha = findViewById(R.id.btn_mecha);

        // Botó Continuar
        btnContinu = findViewById(R.id.btn_continu);

        // Cargar datos guardados si existen
        SharedPreferences preferences = getSharedPreferences("user_data", MODE_PRIVATE);
        btnAccion.setChecked(preferences.getBoolean("Accion", false));
        btnRomance.setChecked(preferences.getBoolean("Romance", false));
        btnFantasia.setChecked(preferences.getBoolean("Fantasia", false));
        btnSlice.setChecked(preferences.getBoolean("SliceOfLife", false));
        btnTerror.setChecked(preferences.getBoolean("Terror", false));
        btnShonen.setChecked(preferences.getBoolean("Shonen", false));
        btnShojo.setChecked(preferences.getBoolean("Shojo", false));
        btnMecha.setChecked(preferences.getBoolean("Mecha", false));

        // Guardar los géneros seleccionados al pulsar Continuar
        btnContinu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("Accion", btnAccion.isChecked());
                editor.putBoolean("Romance", btnRomance.isChecked());
                editor.putBoolean("Fantasia", btnFantasia.isChecked());
                editor.putBoolean("SliceOfLife", btnSlice.isChecked());
                editor.putBoolean("Terror", btnTerror.isChecked());
                editor.putBoolean("Shonen", btnShonen.isChecked());
                editor.putBoolean("Shojo", btnShojo.isChecked());
                editor.putBoolean("Mecha", btnMecha.isChecked());
                editor.apply();

                Toast.makeText(MainActivity4.this, "Generes s'han guardat correctament", Toast.LENGTH_SHORT).show();

                // Aquí puedes ir a la siguiente actividad
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}