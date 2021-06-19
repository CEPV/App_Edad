package com.cpedroza.myapp_edad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, edad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtNombre);
        edad = findViewById(R.id.txtEdad);


    }

    public void Pulsar(View view) {
        if (view.getId() == R.id.btnaceptar) {
            if (!nombre.getText().toString().isEmpty() && !edad.getText().toString().isEmpty()) {
                int campoEdad = Integer.parseInt(edad.getText().toString());

                Intent intent = null;
                if (campoEdad < 18) {
                    intent = new Intent(this, MAMenor.class);
                    startActivity(intent);
                    /*suma.setText(String.valueOf("ladfjlkajdfl"));
                     */

                }
                if (campoEdad >= 18) {
                    intent = new Intent(this, MAMayor.class);
                    startActivity(intent);
                }


            } else {
                Toast.makeText(this, "Campo vacío", Toast.LENGTH_SHORT).show();
            }

        }
        if(view.getId() == R.id.btnSalir){
            this.finish();
        }
    }

}