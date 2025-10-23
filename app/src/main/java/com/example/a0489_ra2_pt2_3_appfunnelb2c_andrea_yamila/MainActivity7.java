package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        ViewPager2 viewPager = findViewById(R.id.viewPager);

        List<CardAdapter.CardData> cards = Arrays.asList(
                new CardAdapter.CardData("Tarjeta 1", "Contenido de la primera tarjeta"),
                new CardAdapter.CardData("Tarjeta 2", "Contenido de la segunda tarjeta"),
                new CardAdapter.CardData("Tarjeta 3", "Contenido de la tercera tarjeta")
        );

        if (cards == null) {
            Log.e("DEBUG", "cards és null!");
        } else {
            Log.d("DEBUG", "cards té " + cards.size() + " elements.");
        }

        viewPager.setAdapter(new CardAdapter(cards));
    }
}