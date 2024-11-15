package com.example.practica5ej4

import Adapter
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practica5ej4.databinding.ActivityMainBinding
import java.util.Arrays


class MainActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityMainBinding
    val imagenes = Arrays.asList<Int>(R.drawable.images, R.drawable.images1, R.drawable.images2, R.drawable.images3,R.drawable.images4, R.drawable.images5, R.drawable.images6)
    val titulos = Arrays.asList<String>("Antico Caffe Greco","Coffe Room","Coffee Ibiza","Pudding Coffee Shop","Smoothy Shop","Blood Shop","Pie Shop")
    val subtitulos = Arrays.asList<String>("St. Italy, Rome","St. Germany, Berlin","St. Colon, Madrid","St. Diagonal, Barcelona","St. SomeStreet Somewhere"," St. AnyStreet Anywhere"," St. Callegon diagon China")
    val puntuaciones = Arrays.asList<Double>(4.5 , 5.0, 2.3, 1.2, 3.3,0.0,4.765)

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById<View>(R.id.main)
        ) { v: View, insets: WindowInsetsCompat ->
            val systemBars =
                insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Una vez configurado ya podemos cambiar las imágenes
        //binding.ImageSwifter.setImageResource(R.drawable.image1);

        binding.recycler.layoutManager = LinearLayoutManager(this)


        val adapter = Adapter(imagenes, titulos, subtitulos, puntuaciones)
        binding.recycler.adapter = adapter


    }

}