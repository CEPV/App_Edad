package com.cpedroza.myapp_edad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MAMayor extends AppCompatActivity {
    private TextView multi;
    private EditText resultadoMulti1 ;
    int nu1;
    int nu2;
    int resultadoM;
    String resultadoRM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamayor);


        multi = findViewById(R.id.txtMulti);
        resultadoMulti1 = findViewById(R.id.editxtResultadoMulti1);
        nu1= (int) (Math.random()*10+1);
        nu2 =(int) (Math.random()*10+1);
        resultadoM = nu1*nu2;

        multi.setText(nu1+" X "+nu2);

    }

    public void Pulsar(View view) {
        if(view.getId()==R.id.btnReMulti) {
            if (!resultadoMulti1.getText().toString().isEmpty()) {
                resultadoRM = resultadoMulti1.getText().toString();
                int re = Integer.parseInt(resultadoRM);
                if (re == resultadoM) {
                    multi.setText("Excelente eres todo un adulto!!!");
                    multi.setTextSize(20);
                    /*Toast.makeText(this,"Es Correcto!!! Ya no eres tan bebé",Toast.LENGTH_LONG).show();*/
                } else {
                    Toast.makeText(this, "Intenta de nuevo", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, "Campo Vacío", Toast.LENGTH_LONG).show();
            }
        }
        if(view.getId() == R.id.btnRegresar){
            this.finish();
        }
    }
    }
