package com.example.salutacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btsaluda;

        btsaluda = (Button)findViewById(R.id.btsaluda);

        btsaluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nom = findViewById(R.id.nombre);
                EditText ap = findViewById(R.id.apellidos);

                String nombre = nom.getText().toString();
                String apellidos = ap.getText().toString();

                Toast.makeText(getApplicationContext(),nombre + " " + apellidos,Toast.LENGTH_LONG).show();
            }
        });

    }
}