package com.example.ejercicioparcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Pitbull =  Mascota()
    var Gato =  Mascota()
    var Hamnster =  Mascota()
    var Conejo =  Mascota()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Pitbull.especie = "Perro"
        Pitbull.color = "Marron"
        Pitbull.sexo = "Masculino"
        Pitbull.peso = 55.0
        Gato.especie = "Gato"
        Gato.color = "Blanco"
        Gato.sexo = "Femenino"
        Gato.peso = 20.0
        Hamnster.especie = "Hamnster"
        Hamnster.color = "Negro"
        Hamnster.sexo = "Masculino"
        Hamnster.peso = 10.0
        Conejo.especie = "Conejo"
        Conejo.color = "Negro con Blanco"
        Conejo.sexo = "Femenino"
        Conejo.peso = 30.0
    }


    fun SelectMascota(Vista: View){
        when(Vista.id){
            R.id.imgb_Perro -> Toast.makeText(this,"Especie: " + Pitbull.especie + ", Color: " + Pitbull.color + ", Sexo: " + Pitbull.sexo + ", Peso: " + Pitbull.peso + "KG", Toast.LENGTH_SHORT).show()
            R.id.imgB_Gato -> Toast.makeText(this,"Especie: " + Gato.especie + ", Color: " + Gato.color + ", Sexo: " + Gato.sexo + ", Peso: " + Gato.peso + "KG", Toast.LENGTH_SHORT).show()
            R.id.imgB_Hamster -> Toast.makeText(this,"Especie: " + Hamnster.especie + ", Color: " + Hamnster.color + ", Sexo: " + Hamnster.sexo + ", Peso: " + Hamnster.peso + "KG", Toast.LENGTH_SHORT).show()
            R.id.imgB_Conejo -> Toast.makeText(this,"Especie: " + Conejo.especie + ", Color: " + Conejo.color + ", Sexo: " + Conejo.sexo + ", Peso: " + Conejo.peso + "KG", Toast.LENGTH_SHORT).show()

        }
    }
}