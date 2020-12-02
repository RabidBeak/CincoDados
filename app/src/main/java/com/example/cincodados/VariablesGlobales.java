package com.example.cincodados;
import android.app.Application;

public class VariablesGlobales extends Application{
    public boolean sonido;

    public boolean isSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }

}