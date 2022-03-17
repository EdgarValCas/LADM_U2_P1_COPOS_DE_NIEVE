package com.example.ladm_u2_p1_copos_de_nieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import kotlin.random.Random


class Copo(l:Lienzo) {
    val l = l
    var x = 0f
    var x1 = 0f
    var x2 = 0f
    var y = 0f
    var y1 = 0f
    var y2 = 0f
    var movX = 0f
    var color = Color.rgb(255,255,255)

    init {
        x = rand(1500)
        movX = rand(6)+2
        y = rand(2000)

        x1 = rand(1500)
        movX = rand(6)+2
        y1 = rand(2000)

        x2 = rand(1500)
        movX = rand(6)+2
        y2 = rand(2000)

        color=Color.rgb(255,255,255)
    }

    private fun rand(hasta:Int) : Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun mover(){
        x -= movX
        if (x<0){
            x = rand(1500)
        }

        x1 -= movX
        if (x1<0){
            x1 = rand(1500)
        }

        x2 -= movX
        if (x2<0){
            x2 = rand(1500)
        }
    }

    fun pintar (canvas : Canvas){
        var p = Paint()
        p.color=color
        canvas.drawCircle(x,y,4F,p)
    }

    fun pintar2 (canvas : Canvas){
        var p = Paint()
        p.color=color
        canvas.drawCircle(x1,y1,6F,p)
    }

    fun pintar3 (canvas : Canvas){
        var p = Paint()
        p.color=color
        canvas.drawCircle(x2,y2,10F,p)
    }
}
