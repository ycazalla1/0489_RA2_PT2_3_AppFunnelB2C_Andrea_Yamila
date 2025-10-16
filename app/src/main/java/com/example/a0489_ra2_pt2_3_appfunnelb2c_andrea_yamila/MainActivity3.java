package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button btnRegisterLogin, btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        btnRegisterLogin = findViewById(R.id.btn_register_login);
        btnGoogle = findViewById(R.id.btn_google);

        // Acción del botón registrar / iniciar sesión
        btnRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí puedes validar email y contraseña
                // Por ahora vamos a la pantalla Home
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        // Acción del botón Google
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lógica para login con Google (puedes integrar Firebase Auth)
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}