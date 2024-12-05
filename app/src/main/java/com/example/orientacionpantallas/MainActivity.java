package com.example.orientacionpantallas;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String textContent = "Texto inicial"; // Guardará el texto actual

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Restaurar el estado del texto si hay datos guardados
        if (savedInstanceState != null) {
            textContent = savedInstanceState.getString("textContent", "Texto inicial");
        }
        textView.setText(textContent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Guardar el contenido actual del TextView
        outState.putString("textContent", textContent);
    }
}
