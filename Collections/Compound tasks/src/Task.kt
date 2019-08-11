import com.sun.org.apache.xpath.internal.operations.Or

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
//    val (a, b) = this.orders.partition {
//        it.isDelivered
//    }
    val c = this.orders.filter { it.isDelivered }
    val products = c.flatMap { it.products }
    return products.maxBy { it.price }

}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val a = this.customers.flatMap { it.orders.flatMap { it.products } }
    return a.count{it == product}
}


