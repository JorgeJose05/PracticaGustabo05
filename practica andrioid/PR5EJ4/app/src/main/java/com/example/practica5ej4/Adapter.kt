import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.example.practica5ej4.R

class Adapter(
    private val imageList: List<Int>,
    private val Titulo: List<String>,
    private val subtitulo: List<String>,
    private val puntuacion: List<Double>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class  CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val titulo : TextView = itemView.findViewById(R.id.textView2)
        val subtitulo : TextView = itemView.findViewById(R.id.textView3)
        val puntuacion : TextView = itemView.findViewById(R.id.textView4)
        val barra : RatingBar = itemView.findViewById(R.id.ratingBar)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageResId = imageList[position]
        holder.imageView.setImageResource(imageResId)
        val tituloid = Titulo[position]
        holder.titulo.setText(tituloid)
        val subtituloid = subtitulo[position]
        holder.subtitulo.setText(subtituloid)
        val puntuacionid = puntuacion[position].toDouble()
        holder.puntuacion.setText(puntuacionid.toString())
        holder.ratingBar.rating = puntuacionid.toFloat()

        holder.ratingBar.setOnRatingBarChangeListener { _, puntos, _ ->
            holder.ratingBar.rating = puntos.toFloat()
            holder.puntuacion.setText(puntos.toString())
         }


    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val titulo : TextView = itemView.findViewById(R.id.textView2)
        val subtitulo : TextView = itemView.findViewById(R.id.textView3)
        val puntuacion : TextView = itemView.findViewById(R.id.textView4)
        val ratingBar : RatingBar = itemView.findViewById(R.id.ratingBar)
    }
}

