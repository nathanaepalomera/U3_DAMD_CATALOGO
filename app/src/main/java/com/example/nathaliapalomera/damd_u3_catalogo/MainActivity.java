package com.example.nathaliapalomera.damd_u3_catalogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo(this));
    }


    public void abrir(){

        Intent abrir = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(abrir);

    }

    public void abrir1(){

        Intent abrir = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(abrir);

    }

    public void abrir2(){

        Intent abrir = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(abrir);

    }

    public void abrir3(){

        Intent abrir = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(abrir);

    }
}
