package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.adapter.ViewProductAdapter
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBinding
    private lateinit var viewProductAdapter: ViewProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        var additionalpics = bundle!!.getIntegerArrayList("additional_pics")
        if (additionalpics == null) {
            additionalpics = intArrayOf(bundle.getInt("photo")).toCollection(ArrayList())
        }

        binding.productPhoto.setImageResource(bundle.getInt("photo"))
        binding.productName.text = bundle.getString("name")
        binding.productCategory.text = bundle.getString("category")
        binding.productDesc.text = bundle.getString("description")
        binding.additionalPics.layoutManager = LinearLayoutManager(applicationContext,
            RecyclerView.HORIZONTAL,false)
        viewProductAdapter = ViewProductAdapter(applicationContext,
            additionalpics as ArrayList<Int>, binding
        )
        binding.additionalPics.adapter = viewProductAdapter
    }

}