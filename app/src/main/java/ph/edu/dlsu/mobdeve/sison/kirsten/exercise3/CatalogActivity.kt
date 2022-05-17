package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.adapter.ProductAdapter
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.dao.ProductDAO
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.dao.ProductDAOArrayImpl
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.databinding.ActivityCatalogBinding
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.model.Category
import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.model.Product

class CatalogActivity : AppCompatActivity() {
    private lateinit var binding:ActivityCatalogBinding
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productArrayList: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

        binding.productList.layoutManager = LinearLayoutManager(applicationContext)
        productAdapter = ProductAdapter(applicationContext, productArrayList)
        binding.productList.adapter = productAdapter
    }

    private fun init() {
        val dao:ProductDAO = ProductDAOArrayImpl()

        var item = Product()
        item.photo = R.drawable.huggywuggy
        item.name = "Huggy Wuggy"
        item.category = Category.TOYS
        item.price = 750F
        item.description = "Huggy Wuggy Toy is a popular character from the popular game Poppy Play Time. It is made of very soft plush cotton filled with soft PP cotton. The toy is very soft with flexible limbs. Length- 40 cm Width- 15 cm Depth- 3 cm Weight-100 gram Color- Blue The product will arrive in compressed packing. Please open the packet for the toy to take its original plush state."
        item.additional_pics = intArrayOf(R.drawable.huggywuggy, R.drawable.huggywuggy1, R.drawable.huggywuggy2).toCollection(ArrayList())
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.huarache
        item.name = "Nike Air Huarache"
        item.category = Category.MENWEAR
        item.price = 5750F
        item.description = "The Nike Air Huarache released in 1991 as a cutting-edge running shoe that helped revolutionize the fit and feel of performance athletic footwear as we know it today. Designed by the one and only Tinker Hatfield, famous for his many iconic Air Jordan and Nike sneakers including the original Air Max running shoe, the Air Huarache has gone on to become a retro sneaker staple in the modern age — just like many of his designs. The Nike Air Huarache was groundbreaking when it released because of the technology it introduced to the world: the Huarache construction."
        item.additional_pics = intArrayOf(R.drawable.huarache, R.drawable.huarache1, R.drawable.huarache2).toCollection(ArrayList())
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.twinkies
        item.name = "Twinkies"
        item.category = Category.FOOD
        item.price = 834F
        item.additional_pics = intArrayOf(R.drawable.twinkies, R.drawable.twinkie1,R.drawable.twinkie2).toCollection(ArrayList())
//        item.description = "The original golden sponge cake with creamy filling, the Twinkie has received legendary status in the U.S. not only as a snack cake but as a cultural icon."
        item.description = "The original golden sponge cake with creamy filling, the Twinkie has received legendary status in the U.S. not only as a snack cake but as a cultural icon. A Twinkie is an American snack cake, described as \"golden sponge cake with a creamy filling\". It was formerly made and distributed by Hostess Brands. The brand is currently owned by Hostess Brands, Inc. (Nasdaq: TWNK), having been formerly owned by private equity firms Apollo Global Management and C. Dean Metropoulos and Company as the second incarnation of Hostess Brands. During bankruptcy proceedings, Twinkie production was suspended on January 21, 2011 and resumed after an absence of a few months from American store shelves, becoming available again nationwide on March 14, 2015."
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.keychron
        item.name = "Keychron V1"
        item.category = Category.GADGETS
        item.price = 4790F
        item.additional_pics = intArrayOf(R.drawable.keychron,R.drawable.keychron1).toCollection(ArrayList())
        item.description = "1 x K8 Pro White Backlit Hot-Swappable Keyboard, included Mac and Windows keycaps, and stretch goal gift/s once unlocked.\n" +
                "\n" +
                "Available in Gateron G Pro Mechanical Red, Blue, Brown switch options (We'll ask your preferences and address after the campaign ends)."
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.perfume
        item.name = "Chanel No. 5"
        item.category = Category.FRAGRANCE
        item.price = 4800F
        item.additional_pics = intArrayOf(R.drawable.perfume, R.drawable.perfume1).toCollection(ArrayList())
        item.description = "Since its creation in 1921, N°5 has exuded the very essence of femininity. The abstract, mysterious scent—alive with countless subtle facets—radiates an extravagant floral richness. In 1986, Jacques Polge reinterpreted his predecessor Ernest Beaux’s composition to create a fuller, more voluminous version of the now and forever fragrance: the Eau de Parfum."
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.huggywuggy
        item.name = "Huggy Wuggy"
        item.category = Category.TOYS
        item.price = 750F
        item.description = "Huggy Wuggy Toy is a popular character from the popular game Poppy Play Time. It is made of very soft plush cotton filled with soft PP cotton. The toy is very soft with flexible limbs. Length- 40 cm Width- 15 cm Depth- 3 cm Weight-100 gram Color- Blue The product will arrive in compressed packing. Please open the packet for the toy to take its original plush state."
        item.additional_pics = intArrayOf(R.drawable.huggywuggy, R.drawable.huggywuggy1, R.drawable.huggywuggy2).toCollection(ArrayList())
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.huarache
        item.name = "Nike Air Huarache"
        item.category = Category.MENWEAR
        item.price = 5750F
        item.description = "The Nike Air Huarache released in 1991 as a cutting-edge running shoe that helped revolutionize the fit and feel of performance athletic footwear as we know it today. Designed by the one and only Tinker Hatfield, famous for his many iconic Air Jordan and Nike sneakers including the original Air Max running shoe, the Air Huarache has gone on to become a retro sneaker staple in the modern age — just like many of his designs. The Nike Air Huarache was groundbreaking when it released because of the technology it introduced to the world: the Huarache construction."
        item.additional_pics = intArrayOf(R.drawable.huarache, R.drawable.huarache1, R.drawable.huarache2).toCollection(ArrayList())
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.twinkies
        item.name = "Twinkies"
        item.category = Category.FOOD
        item.price = 834F
        item.additional_pics = intArrayOf(R.drawable.twinkies, R.drawable.twinkie1,R.drawable.twinkie2).toCollection(ArrayList())
//        item.description = "The original golden sponge cake with creamy filling, the Twinkie has received legendary status in the U.S. not only as a snack cake but as a cultural icon."
        item.description = "The original golden sponge cake with creamy filling, the Twinkie has received legendary status in the U.S. not only as a snack cake but as a cultural icon. A Twinkie is an American snack cake, described as \"golden sponge cake with a creamy filling\". It was formerly made and distributed by Hostess Brands. The brand is currently owned by Hostess Brands, Inc. (Nasdaq: TWNK), having been formerly owned by private equity firms Apollo Global Management and C. Dean Metropoulos and Company as the second incarnation of Hostess Brands. During bankruptcy proceedings, Twinkie production was suspended on January 21, 2011 and resumed after an absence of a few months from American store shelves, becoming available again nationwide on March 14, 2015."
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.keychron
        item.name = "Keychron V1"
        item.category = Category.GADGETS
        item.price = 4790F
        item.additional_pics = intArrayOf(R.drawable.keychron,R.drawable.keychron1).toCollection(ArrayList())
        item.description = "1 x K8 Pro White Backlit Hot-Swappable Keyboard, included Mac and Windows keycaps, and stretch goal gift/s once unlocked.\n" +
                "\n" +
                "Available in Gateron G Pro Mechanical Red, Blue, Brown switch options (We'll ask your preferences and address after the campaign ends)."
        dao.addProduct(item)

        item = Product()
        item.photo = R.drawable.perfume
        item.name = "Chanel No. 5"
        item.category = Category.FRAGRANCE
        item.price = 4800F
        item.additional_pics = intArrayOf(R.drawable.perfume, R.drawable.perfume1).toCollection(ArrayList())
        item.description = "Since its creation in 1921, N°5 has exuded the very essence of femininity. The abstract, mysterious scent—alive with countless subtle facets—radiates an extravagant floral richness. In 1986, Jacques Polge reinterpreted his predecessor Ernest Beaux’s composition to create a fuller, more voluminous version of the now and forever fragrance: the Eau de Parfum."
        dao.addProduct(item)

        productArrayList = dao.getProducts()
    }

}

