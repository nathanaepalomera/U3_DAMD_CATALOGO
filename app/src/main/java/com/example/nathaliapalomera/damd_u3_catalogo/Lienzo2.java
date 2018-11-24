package com.example.nathaliapalomera.damd_u3_catalogo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View {
    Imagen2 icono1, icono2, icono3, icono4, icono5, icono6, icono7, PUNTERO ,icono8
            ,icono9,icono10,icono11,icono12,icono13,icono14,icono15,icono16;
    String mensaje;
    Main4Activity apuntador;
    public Lienzo2(Context context) {
        super(context);

        icono1 = new Imagen2(R.drawable.fon,0,0,this);
        icono2 = new Imagen2(R.drawable.lence,30,30,this);
        icono3 = new Imagen2(R.drawable.rec,0,445,this);
        icono4 = new Imagen2(R.drawable.batarosa,35,470,this);
        icono5 = new Imagen2(R.drawable.batafuisha,35,860,this);
        icono6 = new Imagen2(R.drawable.bataazul,35,1250,this);
        icono7 = new Imagen2(R.drawable.bataroja,35,1640,this);
        icono8 = new Imagen2(R.drawable.batarosasa,490,500,this);
        icono8.hacervisible(false);
        icono9 = new Imagen2(R.drawable.desbatarosa,380,1090,this);
        icono9.hacervisible(false);
        icono10 = new Imagen2(R.drawable.batafuishaa,490,500,this);
        icono10.hacervisible(false);
        icono11 = new Imagen2(R.drawable.desbatafuisha,380,1090,this);
        icono11.hacervisible(false);
        icono12 = new Imagen2(R.drawable.bazuul,490,500,this);
        icono12.hacervisible(false);
        icono13 = new Imagen2(R.drawable.desbataazul,380,1090,this);
        icono13.hacervisible(false);
        icono14 = new Imagen2(R.drawable.batarojaaa,490,500,this);
        icono14.hacervisible(false);
        icono15 = new Imagen2(R.drawable.desbataroja,380,1090,this);
        icono15.hacervisible(false);
        icono16 = new Imagen2(R.drawable.regresarr,910,1670,this);
        icono16.hacervisible(false);
        apuntador = (Main4Activity) context;


    }

    public void onDraw(Canvas c) {
        //super.onDraw(c);
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
        icono16.pintar(c,p);
    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:

                if (icono4.estaenarea(xp, yp)) {

                    PUNTERO = icono4;
                    icono8.hacervisible(true);
                    icono9.hacervisible(true);
                    icono16.hacervisible(true);
                    icono10.hacervisible(false);
                    icono11.hacervisible(false);
                    icono12.hacervisible(false);
                    icono13.hacervisible(false);
                    icono14.hacervisible(false);
                    icono15.hacervisible(false);
                }

                if (icono5.estaenarea(xp, yp)) {
                    PUNTERO = icono5;
                    icono10.hacervisible(true);
                    icono11.hacervisible(true);
                    icono16.hacervisible(true);
                    icono9.hacervisible(false);
                    icono8.hacervisible(false);
                    icono12.hacervisible(false);
                    icono13.hacervisible(false);
                    icono14.hacervisible(false);
                    icono15.hacervisible(false);
                }

                if (icono6.estaenarea(xp, yp))
                {
                    PUNTERO=icono6;
                    icono12.hacervisible(true);
                    icono13.hacervisible(true);
                    icono16.hacervisible(true);
                    icono9.hacervisible(false);
                    icono8.hacervisible(false);
                    icono10.hacervisible(false);
                    icono11.hacervisible(false);
                    icono14.hacervisible(false);
                    icono15.hacervisible(false);

                }

                if (icono7.estaenarea(xp, yp))
                {
                    PUNTERO=icono7;
                    icono15.hacervisible(true);
                    icono14.hacervisible(true);
                    icono16.hacervisible(true);
                    icono12.hacervisible(false);
                    icono13.hacervisible(false);
                    icono9.hacervisible(false);
                    icono8.hacervisible(false);
                    icono10.hacervisible(false);
                    icono11.hacervisible(false);

                }

                if (icono16.estaenarea(xp,yp)) {
                    apuntador.abrir();
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
