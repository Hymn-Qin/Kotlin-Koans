

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun <K, V> buildMap(build: HashMap<K, V>.() -> Unit): Map<K, V> {
    val hashMap = hashMapOf<K, V>()
    hashMap.build()
    return hashMap
}
