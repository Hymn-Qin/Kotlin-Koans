// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProducts = customers.flatMap {
        it.orders.flatMap {
            it.products
        }
    }.toSet()
    return customers.fold(allProducts){ orderedByAll, customer ->
        //一个客户的所有订单中的所有商品
        val products: Set<Product> = customer.orders.flatMap {
            it.products
        }.toSet()
        orderedByAll.intersect(products)
    }
}