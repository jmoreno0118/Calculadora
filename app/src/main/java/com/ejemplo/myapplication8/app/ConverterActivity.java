package com.ejemplo.myapplication8.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ConverterActivity extends ActionBarActivity {
    private ImageButton botonCaf;
    private ImageButton botonFac;
    private TextView respuesta;
    private EditText datos;
    private float centigrados;
    private float farenheit;
    private float calculos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        botonCaf = (ImageButton) findViewById(R.id.btnCaf);
        botonFac = (ImageButton) findViewById(R.id.btnFac);
        respuesta = (TextView) findViewById(R.id.txtRespuesta);
        datos = (EditText) findViewById(R.id.edtCantidad);

        botonCaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                centigrados = Float.parseFloat(datos.getText().toString());
                calculos = (float)(1.8* centigrados +32);
                respuesta.setText(calculos+"");
            }
        });

        botonFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                farenheit = Float.parseFloat(datos.getText().toString());
                calculos = (float)((farenheit-32)/1.8);
                respuesta.setText(calculos+"");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.converter, menu);
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
