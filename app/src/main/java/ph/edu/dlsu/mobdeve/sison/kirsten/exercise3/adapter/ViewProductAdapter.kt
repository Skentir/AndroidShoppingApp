package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.R
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.databinding.ActivityViewBinding
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.databinding.ImageCarousellBinding


class ViewProductAdapter(
    private var context: Context,
    private var photoArray: ArrayList<Int>,
    private var viewBinding: ActivityViewBinding) :
    RecyclerView.Adapter<ViewProductAdapter.ViewProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewProductHolder {
        val itemBinding = ImageCarousellBinding.inflate(
            LayoutInflater.from(parent.context), // Loads layout during runtime
            parent, false       // What are these values for?
        )

        return ViewProductHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewProductHolder, position: Int) {
        holder.bindPhoto(photoArray[position])
    }

    override fun getItemCount(): Int {
        return photoArray.size
    }

    inner class ViewProductHolder(private val itemBinding: ImageCarousellBinding)
        : RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {

        private var photo:Int = R.drawable.test

        init {
            println("Initialized")
            itemView.bringToFront()
            itemView.setOnClickListener(this)
        }

        fun bindPhoto(photo:Int) {
            this.photo = photo
            itemBinding.carousellItem.setImageResource(photo)
        }

        override fun onClick(p0: View?) {
            viewBinding.productPhoto.setImageResource(photo)
        }

    }

}