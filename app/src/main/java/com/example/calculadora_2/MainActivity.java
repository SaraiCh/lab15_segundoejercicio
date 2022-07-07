package com.example.calculadora_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText dato1, dato2;
    Button suma,resta,división,multiplicacion,potencia,raiz,modulo,porcentaje,log,vabsoluto;
    Button nuevo;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dato1 = findViewById(R.id.edit1);
        dato2 = findViewById(R.id.edit2);
        suma = findViewById(R.id.btnsuma);
        resta = findViewById(R.id.btnresta);
        división = findViewById(R.id.btndivision);
        multiplicacion = findViewById(R.id.btnmutiplicacion);
        potencia = findViewById(R.id.btnpotencia);
        raiz = findViewById(R.id.btnraiz);
        modulo = findViewById(R.id.modulo);
        porcentaje = findViewById(R.id.btnporcentaje);
        log = findViewById(R.id.btnIn);
        vabsoluto = findViewById(R.id.btnabsoluto);
        nuevo = findViewById(R.id.btnnuevo);
        resultado = findViewById(R.id.tResultado);


    }

    public void setdivision(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual= num1 / num2;
        resultado.setText(Double.toString(igual));
    }

    public void setpotencia(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual = Math.pow(num1, num2);
        resultado.setText(Double.toString(igual));
    }

    public void setraiz(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double igual = Math.sqrt(num1);
        resultado.setText(Double.toString(igual));
    }

    public void setsuma(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual = num1 + num2;
        resultado.setText(Double.toString(igual));
    }

    public void setmultiplicacion(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual = num1 * num2;
        resultado.setText(Double.toString(igual));
    }

    public void setresta(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual = num1 - num2;
        resultado.setText(Double.toString(igual));
    }

    public void setModulo(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double num2 = Double.parseDouble(dato2.getText().toString());
        double igual = num1 % num2;
        resultado.setText(Double.toString(igual));
    }

    public void setporcentaje(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double igual = num1 * 0.01;
        resultado.setText(Double.toString(igual));
    }

    public void setIn(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double igual = Math.log10(num1);
        resultado.setText(Double.toString(igual));
    }

    public void setabsoluto(View view) {
        double num1 = Double.parseDouble(dato1.getText().toString());
        double igual = +num1;
        resultado.setText(Double.toString(igual));
    }

    public void setnuevo(View view) {
        resultado.setText(null);
        dato1.setText(null);
        dato2.setText(null);
    }
}