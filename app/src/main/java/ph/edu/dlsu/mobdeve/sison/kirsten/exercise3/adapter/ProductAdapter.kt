package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.ViewActivity
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.databinding.ProductItemBinding
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.model.Product

class ProductAdapter(
    private var context: Context,
    private var productArray: ArrayList<Product>
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemBinding = ProductItemBinding.inflate(
            LayoutInflater.from(parent.context), // Loads layout during runtime
            parent, false       // What are these values for?
        )
        return ProductViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindProduct(productArray[position])
    }

    override fun getItemCount(): Int {
        return productArray.size
    }


    inner class ProductViewHolder(private val itemBinding: ProductItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root), View.OnClickListener {
        private var product = Product()

        init {
            itemView.setOnClickListener(this)
        }
        @SuppressLint("SetTextI18n")
        fun bindProduct(product:Product) {
            this.product = product
            itemBinding.productPhoto.setImageResource(product.photo)
            itemBinding.productName.text = product.name
            itemBinding.productCategory.text = product.category.printableName
            itemBinding.productPrice.text = "₱ " + product.price.toString()
        }

        override fun onClick(p0: View?) {
            val goToView = Intent(context, ViewActivity::class.java)
            val bundle = Bundle()
            bundle.putInt("photo", product.photo)
            bundle.putString("name", product.name)
            bundle.putString("category", product.category.printableName)
            bundle.putString("price", product.price.toString())
            bundle.putString("description", product.description)
            bundle.putIntegerArrayList("additional_pics", product.additional_pics)
            goToView.putExtras(bundle)
            goToView.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(goToView)
        }

    }

}
