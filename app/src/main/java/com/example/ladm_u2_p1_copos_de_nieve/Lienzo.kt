package com.example.ladm_u2_p1_copos_de_nieve

import android.graphics.*
import android.view.View
import kotlinx.coroutines.*
import kotlin.coroutines.EmptyCoroutineContext

class Lienzo(este:MainActivity) : View(este){
    val este = este

    val copos = Array<Copo>(100,{Copo(this@Lienzo)})

    val corutina = GlobalScope.launch {
        while (true){
            este.runOnUiThread {
                invalidate()
            }
            delay(10L)
        }
    }
    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        val p = Paint()

        //color de fondo
        var color = Color.rgb(0,0,51)
        c.drawColor(color)

        //montaña verde
        p.style = Paint.Style.FILL
        p.color = Color.rgb(0,204,0)
        c.drawOval(-300f, -200f , 300f,850f,p)
        c.drawOval(-200f, 350f , 500f,1650f,p)
        c.drawOval(-100f, 1450f , 400f,2400f,p)

        //arbol izquierda
        p.style = Paint.Style.FILL
        p.color = Color.rgb(153,76,0)
        c.drawRect(230f,120f,450f,215f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(230f,120f,450f,215f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawOval(360f, 20f , 500f,320f,p)
        c.drawOval(420f, 20f , 560f,320f,p)
        c.drawOval(480f, 20f , 620f,320f,p)

        p.style = Paint.Style.FILL
        p.color = Color.rgb(0,153,0)
        c.drawOval(360f, 20f , 500f,320f,p)
        c.drawOval(420f, 20f , 560f,320f,p)
        c.drawOval(480f, 20f , 620f,320f,p)

        //arbol central
        p.style = Paint.Style.FILL
        p.color = Color.rgb(153,76,0)
        c.drawRect(450f,748f,570f,798f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(450f,748f,570f,798f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawOval(520f, 700f , 620f,850f,p)
        c.drawOval(580f, 700f , 680f,850f,p)
        c.drawOval(640f, 700f , 740f,850f,p)

        p.style = Paint.Style.FILL
        p.color = Color.rgb(0,153,0)
        c.drawOval(520f, 700f , 620f,850f,p)
        c.drawOval(580f, 700f , 680f,850f,p)
        c.drawOval(640f, 700f , 740f,850f,p)

        //arbol derecha
        p.style = Paint.Style.FILL
        p.color = Color.rgb(153,76,0)
        c.drawRect(-200f,1800f,270f,2200f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(-200f,1800f,270f,2200f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawOval(150f, 1600f , 350f,2400f,p)
        c.drawOval(300f, 1600f , 500f,2400f,p)
        c.drawOval(450f, 1600f , 650f,2400f,p)

        p.style = Paint.Style.FILL
        p.color = Color.rgb(0,153,0)
        c.drawOval(150f, 1600f , 350f,2400f,p)
        c.drawOval(300f, 1600f , 500f,2400f,p)
        c.drawOval(450f, 1600f , 650f,2400f,p)

        //casa (paredes)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(255,255,102)
        c.drawRect(300f,1000f,570f,1450f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(300f,1000f,570f,1450f,p)


        //casa (techo)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(255,128,0)
        p.strokeWidth = 6F
        val path = Path()
        path.moveTo(500f,940f)
        path.lineTo(650f,1040f)
        path.lineTo(650f,1410f)
        path.lineTo(500f,1510f)
        path.close()
        c.drawPath(path,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        path.moveTo(500f,940f)
        path.lineTo(650f,1040f)
        path.lineTo(650f,1410f)
        path.lineTo(500f,1510f)
        path.close()
        c.drawPath(path,p)

        //casa (puerta)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(204,102,0)
        c.drawRect(300f,1050f,420f,1120f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(300f,1050f,420f,1120f,p)

        //casa (ventana)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(51,255,255)
        c.drawRect(360f,1150f,460f,1420f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(360f,1150f,460f,1420f,p)

        c.drawLine(360f,1285f,460f,1285f,p)
        c.drawLine(410f,1150f,410f,1420f,p)

        //casa (chimenea)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(255,51,51)
        c.drawRect(630f,1070f,730f,1140f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 9f
        p.color = Color.rgb(0,0,0)
        c.drawRect(630f,1070f,730f,1140f,p)

        //casa (humo)
        p.style = Paint.Style.FILL
        p.color = Color.rgb(255,255,255)
        c.drawOval(750f, 1072f , 800f,1138f,p)
        c.drawOval(780f, 1145f , 850f,1220f,p)
        c.drawOval(810f, 1227f , 910f,1400f,p)

        for (cop in copos){
            cop.mover()
            cop.pintar(c)
            cop.pintar2(c)
            cop.pintar3(c)
        }

    }

}