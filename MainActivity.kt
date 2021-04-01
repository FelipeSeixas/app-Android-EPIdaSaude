package br.com.kotlincustocombustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularViagem(view: View){

        val precoParcial = precoBomba.text.toString().toDouble()
        val dist = distancia.text.toString().toDouble()

        val kmLitro = 15.6
        val litros = dist / kmLitro
//        val lit = litros.roundToInt()

        val precoFinal = litros * precoParcial

        val res = precoFinal.toInt()

        resultado.setText("Custo total = R$ $res")
//                " $precoFinal")
    }
}