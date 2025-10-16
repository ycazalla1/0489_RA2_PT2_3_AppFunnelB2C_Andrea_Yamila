package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.Intent;
import android.os.Bundle;
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
    private Button btnNext;
    private ArrayList<String> selectedGenres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnAccion = findViewById(R.id.btn_accion);
        btnRomance = findViewById(R.id.btn_romance);
        btnFantasia = findViewById(R.id.btn_fantasia);
        btnSlice = findViewById(R.id.btn_slice);
        btnTerror = findViewById(R.id.btn_terror);
        btnShonen = findViewById(R.id.btn_shonen);
        btnShojo = findViewById(R.id.btn_shojo);
        btnMecha = findViewById(R.id.btn_mecha);
        btnNext = findViewById(R.id.btn_next_genre);

        selectedGenres = new ArrayList<>();

        btnNext.setOnClickListener(v -> {
            selectedGenres.clear();
            if (btnAccion.isChecked()) selectedGenres.add("Acción");
            if (btnRomance.isChecked()) selectedGenres.add("Romance");
            if (btnFantasia.isChecked()) selectedGenres.add("Fantasía");
            if (btnSlice.isChecked()) selectedGenres.add("Slice of Life");
            if (btnTerror.isChecked()) selectedGenres.add("Terror");
            if (btnShonen.isChecked()) selectedGenres.add("Shonen");
            if (btnShojo.isChecked()) selectedGenres.add("Shojo");
            if (btnMecha.isChecked()) selectedGenres.add("Mecha");

            if (selectedGenres.isEmpty()) {
                Toast.makeText(this, "Selecciona al menos un género", Toast.LENGTH_SHORT).show();
            } else {
                // Aquí puedes guardar los géneros en SharedPreferences o pasar al Home
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putStringArrayListExtra("selectedGenres", selectedGenres);
                startActivity(intent);
            }
        });
    }
}