package com.example.nathaliapalomera.damd_u3_catalogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo4(this));

    } public void abrir(){

        Intent abrir = new Intent(Main6Activity.this, MainActivity.class);
        startActivity(abrir);

    }


}
