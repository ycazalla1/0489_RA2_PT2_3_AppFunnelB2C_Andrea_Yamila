package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);

        // Ruta del video
        String path = "android.resource://" + getPackageName() + "/" + R.raw.fons_panatalla_prova;
        Uri uri = Uri.parse(path);
        videoView.setVideoURI(uri);

        // Controles de reproducción
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Iniciar video
        videoView.start();

        // Listener cuando termine el video
        videoView.setOnCompletionListener(mp -> {
            // Ir a la siguiente Activity
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            finish(); // Opcional: cerrar la Activity actual
        });
    }
}