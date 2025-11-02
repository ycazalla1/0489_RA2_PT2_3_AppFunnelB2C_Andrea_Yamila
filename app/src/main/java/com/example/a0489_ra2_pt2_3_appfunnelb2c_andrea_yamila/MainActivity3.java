package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button btnRegisterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        btnRegisterLogin = findViewById(R.id.btn_register_login);

        // Cargar datos guardados si existen
        SharedPreferences preferences = getSharedPreferences("user_data", MODE_PRIVATE);
        String savedEmail = preferences.getString("email", "");
        String savedPassword = preferences.getString("password", "");

        emailInput.setText(savedEmail);
        passwordInput.setText(savedPassword);

        // Acción del botón registrar / iniciar sesión
        btnRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Guardar los datos en SharedPreferences
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("email", email);
                editor.putString("password", password);
                editor.apply();

                Toast.makeText(MainActivity3.this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();

                // Ir a la pantalla Home
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}