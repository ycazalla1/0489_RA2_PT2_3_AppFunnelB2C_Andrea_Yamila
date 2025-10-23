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
                new CardAdapter.CardData("Pla mig",
                        "-> Veure anime en 1 dispositiu alhora" +
                                "\n-> Ofertes de la botiga de SoraPlay:" +
                                "5% de descompte en productes seleccionats;" +
                                "ofertes exclusives per a membres i accés anticipat a certes promocions;" +
                                "enviament EU gratuït > 75 € *",
                        "4,99 € / mes"),
                new CardAdapter.CardData("Pla premium",
                        "-> Veure anime en 4 dipositius alhora" +
                                "\n-> Contingut sense connexió" +
                                "\n-> Accedeix a Crunchyroll Game Vault, un catàleg de jocs gratuïts" +
                                "\n-> Ofertes de la botiga de SoraPlay:" +
                                "5% de descompte en productes seleccionats;" +
                                "ofertes exclusives per a membres i accés anticipat a certes promocions;" +
                                "enviament EU gratuït > 50 € *",
                        "6,49 € / mes")
        );

        if (cards == null) {
            Log.e("DEBUG", "cards és null!");
        } else {
            Log.d("DEBUG", "cards té " + cards.size() + " elements.");
        }

        viewPager.setAdapter(new CardAdapter(cards));
    }
}