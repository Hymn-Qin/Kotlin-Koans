// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
    val (positive, negative) = it.orders.partition { it.isDelivered }
    positive.count() < negative.count()
}.toSet()
