package com.example.nathaliapalomera.damd_u3_catalogo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Imagen icono1, icono2, icono3, icono4, icono5, icono6, icono7, PUNTERO ,icono8
            ,icono9,icono10,icono11,icono12,icono13,icono14,icono15;
    String mensaje;
    MainActivity apuntador;

    public Lienzo(Context context) {
        super(context);
        icono1 = new Imagen(R.drawable.fon,0,0,this);
        icono2 = new Imagen(R.drawable.lence,30,30,this);
        icono3 = new Imagen(R.drawable.imgbaby, 40,570,this);
        icono4 = new Imagen(R.drawable.imgbra, 390,570,this);
        icono5 = new Imagen(R.drawable.imgbata, 740,570,this);
        icono6 = new Imagen(R.drawable.imgpijama, 1060,570,this);
        icono8 = new Imagen(R.drawable.desbabydoll, 55,1010,this);
        icono8.hacervisible(false);
        icono10 = new Imagen(R.drawable.desbrale, 55,1190,this);
        icono10.hacervisible(false);
        icono11 = new Imagen(R.drawable.desbatas, 55,1190,this);
        icono11.hacervisible(false);
        icono12 = new Imagen(R.drawable.despijamas, 55,1190,this);
        icono12.hacervisible(false);
        icono7 = new Imagen(R.drawable.pink,0,1100,this);
        icono9 = new Imagen(R.drawable.irr,905,1665,this);
        icono9.hacervisible(false);
        icono13 = new Imagen(R.drawable.irr,905,1665,this);
        icono13.hacervisible(false);
        icono14 = new Imagen(R.drawable.irr,905,1665,this);
        icono14.hacervisible(false);
        icono15 = new Imagen(R.drawable.irr,905,1665,this);
        icono15.hacervisible(false);
        PUNTERO =null;

        apuntador =(MainActivity) context;



    }

    public void onDraw(Canvas c) {

        super.onDraw(c);
        Paint p = new Paint();
        p.setTextSize(65);
        p.setColor(Color.BLACK);
        c.drawColor(Color.LTGRAY);
        icono1.pintar(c,p);
        icono2.pintar(c,p);
        c.drawText("SLICK E SATIN", 490, 180, p);
        p.setTextSize(55);
        c.drawText("EXCLUSIVE COLLECTION", 400, 260, p);
        icono3.pintar(c,p);
        icono4.pintar(c,p);
        icono5.pintar(c,p);
        icono6.pintar(c,p);
        icono7.pintar(c,p);
        icono8.pintar(c,p);
        icono9.pintar(c,p);
        icono10.pintar(c,p);
        icono11.pintar(c,p);
        icono12.pintar(c,p);
        icono13.pintar(c,p);
        icono14.pintar(c,p);
        icono15.pintar(c,p);

    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:
                if (icono3.estaenarea(xp, yp)) {

                    PUNTERO = icono3;
                    icono8.hacervisible(true);
                    icono9.hacervisible(true);
                    icono13.hacervisible(false);
                    icono10.hacervisible(false);
                    icono11.hacervisible(false);
                    icono12.hacervisible(false);
                    icono14.hacervisible(false);
                    icono15.hacervisible(false);

                }
                if (icono4.estaenarea(xp, yp)) {

                    PUNTERO = icono4;
                    icono10.hacervisible(true);
                    icono13.hacervisible(true);
                    icono9.hacervisible(false);
                    icono8.hacervisible(false);
                    icono14.hacervisible(false);
                    icono11.hacervisible(false);
                    icono12.hacervisible(false);
                    icono15.hacervisible(false);
                }

                if (icono5.estaenarea(xp, yp)) {
                    PUNTERO = icono5;
                    icono11.hacervisible(true);
                    icono14.hacervisible(true);
                    icono9.hacervisible(false);
                    icono13.hacervisible(false);
                    icono8.hacervisible(false);
                    icono10.hacervisible(false);
                    icono12.hacervisible(false);
                    icono15.hacervisible(false);
                }

                if (icono6.estaenarea(xp, yp))
                {
                    PUNTERO=icono6;
                    icono12.hacervisible(true);
                    icono15.hacervisible(true);
                    icono9.hacervisible(false);
                    icono8.hacervisible(false);
                    icono10.hacervisible(false);
                    icono11.hacervisible(false);
                    icono13.hacervisible(false);
                    icono14.hacervisible(false);

                }


                if (icono9.estaenarea(xp,yp)) {
                    apuntador.abrir();
                }

                if (icono13.estaenarea(xp,yp)){
                    apuntador.abrir1();
                }

                if (icono14.estaenarea(xp,yp)){
                    apuntador.abrir2();
                }

                if (icono15.estaenarea(xp,yp)){
                    apuntador.abrir3();
                }




                break;
               /* if (icono1.estaenarea(xp,yp)) {
                    icono1.mover(xp,yp);
                }
                if (icono2.estaenarea(xp,yp)) {
                    icono2.mover(xp,yp);
                }*/



        }
        invalidate();

        return true;
    }

    }
