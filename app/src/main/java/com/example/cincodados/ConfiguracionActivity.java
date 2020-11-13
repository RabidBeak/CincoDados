package com.example.cincodados;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfiguracionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
    }

    public void clickAtras(View view){
        Intent intent = new Intent(ConfiguracionActivity.this, MainActivity.class);
        startActivity(intent);
    }

}