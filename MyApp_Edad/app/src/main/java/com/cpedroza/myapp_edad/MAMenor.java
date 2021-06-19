package com.cpedroza.myapp_edad;

import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MAMenor extends AppCompatActivity {
    private TextView suma;
    private EditText resultado;
    int n1;
    int n2;
    int resultadoSuma;
    String resultadoR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamenor);
        suma = findViewById(R.id.txtSuma);
        resultado = findViewById(R.id.editxtResultado);
        n1= (int) (Math.random()*20+1);
        n2 =(int) (Math.random()*20+1);
        resultadoSuma = n1+n2;

        suma.setText(n1+" + "+n2);

    }

public void validar(){
    if(!resultado.getText().toString().isEmpty()){
        resultadoR = resultado.getText().toString();
        int re = Integer.parseInt(resultadoR);
        if(re==resultadoSuma){
            suma.setText("Es Correcto!!! Ya no eres tan bebé");
            suma.setTextSize(20);
            /*Toast.makeText(this,"Es Correcto!!! Ya no eres tan bebé",Toast.LENGTH_LONG).show();*/
        }else {
            Toast.makeText(this,"Intenta de nuevo",Toast.LENGTH_SHORT).show();
        }
    }else {
        Toast.makeText(this,"Campo vacío",Toast.LENGTH_SHORT).show();
    }
}
    public void Pulsar(View view) {

        if(view.getId()==R.id.btnRe){
            this.validar();

        }
        if(view.getId() == R.id.btnRegresar){
            this.finish();
        }
    }
}