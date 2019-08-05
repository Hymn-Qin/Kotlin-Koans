class DateRange(val start: MyDate, val endInclusive: MyDate)  {

    //in 包含操作符
    operator fun contains(date: MyDate): Boolean {
        return date in  start..endInclusive
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
