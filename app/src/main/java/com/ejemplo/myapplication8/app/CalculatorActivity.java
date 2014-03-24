package com.ejemplo.myapplication8.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends ActionBarActivity {
    private float dig1;
    private float dig2;
    private Button num1, num2,num3, num4,num5, num6, num7, num8, num9, num0, opmas, opmenos, opdiv, oppor, opigual, oppunto, opc;
    private TextView resultado;
    private String operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        resultado = (TextView) findViewById(R.id.txtResultado);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        opmas = (Button) findViewById(R.id.opsuma);
        opmenos = (Button) findViewById(R.id.opresta);
        opdiv = (Button) findViewById(R.id.opdiv);
        oppor = (Button) findViewById(R.id.opmulti);
        opigual = (Button) findViewById(R.id.opigual);
        oppunto = (Button) findViewById(R.id.oppunto);
        opc = (Button) findViewById(R.id.opc);
        operacion = "";dig1 = 0;dig2 = 0;

        opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");operacion = "";dig1 = 0;dig2 = 0;
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+"9");
            }
        });

        oppunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clean();
                resultado.setText(resultado.getText()+".");
            }
        });

        opmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacion == "" || operacion == "="){
                    setOperacion("+");
                }else{
                    backOperacion(operacion);
                }
            }
        });

        opmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacion == "" || operacion == "="){
                    setOperacion("-");
                }else{
                    backOperacion(operacion);
                }
            }
        });

        opdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacion == "" || operacion == "="){
                    setOperacion("/");
                }else{
                    backOperacion(operacion);
                }
            }
        });

        oppor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacion == "" || operacion == "="){
                    setOperacion("*");
                }else{
                    backOperacion(operacion);
                }
            }
        });

        opigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realizarOperacion();
            }
        });
    }

    private void realizarOperacion(){
        String dato = resultado.getText().toString();
        if(operacion == "+"){
            if(dato != ""){
                dig2 = Float.parseFloat(dato);
                dig1 = dig1 + dig2;
                print();
            }
        }else if(operacion == "-"){
            if(dato != ""){
                dig2 = Float.parseFloat(dato);
                dig1 = dig1 - dig2;
                print();
            }
        }else if(operacion == "*"){
            if(dato != ""){
                dig2 = Float.parseFloat(dato);
                dig1 = dig1 * dig2;
                print();
            }
        }else if(operacion == "/"){
            if(dato != ""){
                dig2 = Float.parseFloat(dato);
                dig1 = dig1 / dig2;
                print();
            }
        }
    }

    private void print(){
        resultado.setText(dig1+"");
        operacion = "=";
    }

    private void backOperacion(String op){
        if(operacion != "="){
            String dato = resultado.getText().toString();
            if(operacion == "+"){
                if(dato != ""){
                    dig2 = Float.parseFloat(dato);
                    dig1 = dig1 + dig2;
                }
            }else if(operacion == "-"){
                if(dato != ""){
                    dig2 = Float.parseFloat(dato);
                    dig1 = dig1 - dig2;
                }
            }else if(operacion == "*"){
                if(dato != ""){
                    dig2 = Float.parseFloat(dato);
                    dig1 = dig1 * dig2;
                }
            }else if(operacion == "/"){
                if(dato != ""){
                    dig2 = Float.parseFloat(dato);
                    dig1 = dig1 / dig2;
                }
            }
        }else if(operacion == "="){
            operacion = "";
            backOperacion(op);
        }
    }

    private void setOperacion(String op){
        String dato = resultado.getText().toString();
        if(dato != ""){
            dig1 = Float.parseFloat(dato);
            resultado.setText("");
            operacion = op;
        }
    }

    private void clean(){
        if(operacion == "="){
            resultado.setText("");
            operacion = "";
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
