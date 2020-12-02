package com.example.cincodados;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

public class ConfiguracionActivity extends AppCompatActivity {

    Switch switch_config_sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        VariablesGlobales variablesGlobales = (VariablesGlobales) getApplicationContext();
        switch_config_sonido = findViewById(R.id.switch_config_sonido);
        switch_config_sonido.setChecked(variablesGlobales.isSonido());
    }

    public void clickAtras(View view){
        VariablesGlobales variablesGlobales = (VariablesGlobales) getApplicationContext();
        variablesGlobales.setSonido(switch_config_sonido.isChecked());
        super.onBackPressed();
    }

}