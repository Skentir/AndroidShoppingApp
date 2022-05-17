package ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.dao

import ph.edu.dlsu.mobdeve.sison.kirsten.exercise3.model.Product

interface ProductDAO {
    fun addProduct(product:Product)
    fun getProducts():ArrayList<Product>
}

class ProductDAOArrayImpl:ProductDAO {
    private var arrayListProducts = ArrayList<Product>()

    override fun addProduct(product: Product) {
        arrayListProducts.add(product)
    }

    override fun getProducts():ArrayList<Product> {
        return arrayListProducts
    }
}