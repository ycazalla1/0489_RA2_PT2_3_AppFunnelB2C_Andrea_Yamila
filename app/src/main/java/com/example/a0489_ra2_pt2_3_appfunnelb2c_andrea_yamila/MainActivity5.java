package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.ClipData;
import android.media.RouteListingPreference;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Trending Now
        List<Item> trendingItems = Arrays.asList(
                new Item("Attack on Titan", R.drawable.attack_on_titan_lsit),
                new Item("One Punch Man", R.drawable.onepunchman_list),
                new Item("Demon Slayer", R.drawable.kimetsu_no_yaiba),
                new Item("My Hero Academia", R.drawable.boku_no_hero_list),
                new Item("Jujutsu Kaisen", R.drawable.jujutsu_kaisen_list),
                new Item("Chainsaw Man", R.drawable.chainsaw_man_list)
        );

        // Nous episodis

        // Recomenar per tú

        setUpRecyclerView(R.id.recyclerTrending, trendingItems);
    }

    private void setUpRecyclerView(int recyclerId, List<Item> items) {
        RecyclerView recyclerView = findViewById(recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new ItemAdapter(items));
    }
}