package com.example.cincodados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView[] img_dado = new ImageView[6];
    Button btn_RodarDados;
    int [] valor_dado = new int[7];
    int total_dados = 5;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_dado[1] = findViewById(R.id.img_dado1);
        img_dado[2] = findViewById(R.id.img_dado2);
        img_dado[3] = findViewById(R.id.img_dado3);
        img_dado[4] = findViewById(R.id.img_dado4);
        img_dado[5] = findViewById(R.id.img_dado5);

        btn_RodarDados = findViewById(R.id.btn_main_rodarDados);

        valor_dado[1] = 1;
        valor_dado[2] = 2;
        valor_dado[3] = 3;
        valor_dado[4] = 4;
        valor_dado[5] = 5;

        ActualizarDados();

        btn_RodarDados.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btn_RodarDados.setBackgroundResource(R.drawable.rodar_pressed);
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        btn_RodarDados.setBackgroundResource(R.drawable.rodar_standby);
                        RodarDados();
                        break;
                }
                return false;
            }
        });

    }

    private void ActualizarDados() {
        switch (valor_dado[1]){
            case 1:
                img_dado[1].setImageResource(R.drawable.dado_1);
                break;
            case 2:
                img_dado[1].setImageResource(R.drawable.dado_2);
                break;
            case 3:
                img_dado[1].setImageResource(R.drawable.dado_3);
                break;
            case 4:
                img_dado[1].setImageResource(R.drawable.dado_4);
                break;
            case 5:
                img_dado[1].setImageResource(R.drawable.dado_5);
                break;
            case 6:
                img_dado[1].setImageResource(R.drawable.dado_6);
                break;
            default:
                img_dado[1].setImageResource(R.drawable.dado_nulo);
                break;
        }

        switch (valor_dado[2]){
            case 1:
                img_dado[2].setImageResource(R.drawable.dado_1);
                break;
            case 2:
                img_dado[2].setImageResource(R.drawable.dado_2);
                break;
            case 3:
                img_dado[2].setImageResource(R.drawable.dado_3);
                break;
            case 4:
                img_dado[2].setImageResource(R.drawable.dado_4);
                break;
            case 5:
                img_dado[2].setImageResource(R.drawable.dado_5);
                break;
            case 6:
                img_dado[2].setImageResource(R.drawable.dado_6);
                break;
            default:
                img_dado[2].setImageResource(R.drawable.dado_nulo);
                break;
        }

        switch (valor_dado[3]){
            case 1:
                img_dado[3].setImageResource(R.drawable.dado_1);
                break;
            case 2:
                img_dado[3].setImageResource(R.drawable.dado_2);
                break;
            case 3:
                img_dado[3].setImageResource(R.drawable.dado_3);
                break;
            case 4:
                img_dado[3].setImageResource(R.drawable.dado_4);
                break;
            case 5:
                img_dado[3].setImageResource(R.drawable.dado_5);
                break;
            case 6:
                img_dado[3].setImageResource(R.drawable.dado_6);
                break;
            default:
                img_dado[3].setImageResource(R.drawable.dado_nulo);
                break;
        }

        switch (valor_dado[4]){
            case 1:
                img_dado[4].setImageResource(R.drawable.dado_1);
                break;
            case 2:
                img_dado[4].setImageResource(R.drawable.dado_2);
                break;
            case 3:
                img_dado[4].setImageResource(R.drawable.dado_3);
                break;
            case 4:
                img_dado[4].setImageResource(R.drawable.dado_4);
                break;
            case 5:
                img_dado[4].setImageResource(R.drawable.dado_5);
                break;
            case 6:
                img_dado[4].setImageResource(R.drawable.dado_6);
                break;
            default:
                img_dado[4].setImageResource(R.drawable.dado_nulo);
                break;
        }

        switch (valor_dado[5]){
            case 1:
                img_dado[5].setImageResource(R.drawable.dado_1);
                break;
            case 2:
                img_dado[5].setImageResource(R.drawable.dado_2);
                break;
            case 3:
                img_dado[5].setImageResource(R.drawable.dado_3);
                break;
            case 4:
                img_dado[5].setImageResource(R.drawable.dado_4);
                break;
            case 5:
                img_dado[5].setImageResource(R.drawable.dado_5);
                break;
            case 6:
                img_dado[5].setImageResource(R.drawable.dado_6);
                break;
            default:
                img_dado[5].setImageResource(R.drawable.dado_nulo);
                break;
        }
    }

    public void clickConfiguracion(View view){
        Intent intent = new Intent(MainActivity.this, ConfiguracionActivity.class);
        startActivity(intent);
    }

    public void clickRestarDado(View view){
        if(total_dados > 0){
            valor_dado[total_dados] = 0;
            total_dados = total_dados - 1;
        }
        ActualizarDados();
    }

    public void clickAgregarDado(View view){
        if(total_dados < 5){
            valor_dado[total_dados + 1] = 1;
            total_dados = total_dados + 1;
        }
        ActualizarDados();
    }

    public void RodarDados(){
        if(total_dados > 0){
            for(int i = 1; i <= total_dados; i++){
                Random azar = new Random();
                int azar_numero = azar.nextInt(6);
                azar_numero++;
                valor_dado[i] = azar_numero;
                ActualizarDados();
            }
        }
    }

}
