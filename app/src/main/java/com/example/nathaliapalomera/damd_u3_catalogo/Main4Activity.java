package com.example.nathaliapalomera.damd_u3_catalogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo2(this));
    }
    public void abrir(){

        Intent abrir = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(abrir);

    }
}
