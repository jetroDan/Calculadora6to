package com.example.calculadora6to;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Classmtd {

    private EditText result1;
    private EditText result2;
    private Button suma;
    private Button resta;
    private Button division;
    private Button mult;
    private Button mod;
    private Button andBit;
    private Button orBit;
    private Button not;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result1 = findViewById(R.id.Result1);
        result2 = findViewById(R.id.Result2);
        suma = findViewById(R.id.Suma);
        resta = findViewById(R.id.Resta);
        division = findViewById(R.id.Div);
        mult = findViewById(R.id.Mult);
        mod = findViewById(R.id.Modulo);
        andBit = findViewById(R.id.Andbit);
        orBit = findViewById(R.id.Orbit);
        not = findViewById(R.id.Notbit);
        resultado = findViewById(R.id.Resultado);


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Sumamtd()));
            }
        });


        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Restamtd()));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Divisionmtd()));
            }
        });


        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Multmtd()));
            }
        });

        /*
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Modulomtd()));
            }
        });

        andBit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Andbitmtd()));
            }
        });

        orBit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Orbitmtd()));
            }
        });

        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Notmtd()));
            }
        });*/

    }




    public float Sumamtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 + num2;
        return total;

    }
    public float Restamtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 - num2;
        return total;

    }
    public float Divisionmtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 / num2;
        return total;

    }
    public float Multmtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 * num2;
        return total;

    }
    /*
    public float Modulomtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 % num2;
        return total;

    }
    public float Andbitmtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 + num2;
        return total;

    }
    public float Orbitmtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 + num2;
        return total;

    }
    public float Notmtd(){
        float total = 0;
        float num1 = Float.parseFloat(result1.getText().toString());
        float num2 = Float.parseFloat(result2.getText().toString());
        total = num1 / num2;
        return total;

    }*/
}




