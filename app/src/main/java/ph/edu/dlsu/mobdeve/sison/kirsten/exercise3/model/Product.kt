package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.model
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.R

class Product {
    var photo: Int = R.drawable.test
    lateinit var name:String
    lateinit var category: Category
    var price: Float = 0F
    lateinit var additional_pics: ArrayList<Int>
    var description: String = "No product description"
}

enum class Category(val printableName: String) {
    FOOD("Food and Beverages"),
    MENWEAR("Men's Wear"),
    TOYS("Videogames and Toys"),
    MAKEUP("Women's Makeup"),
    GADGETS("Tech and Gadgets"),
    FRAGRANCE("Perfume & Cologne")
}