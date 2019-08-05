class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {

    override fun iterator(): Iterator<MyDate> {
        var nowDate = start
        return object :Iterator<MyDate> {
            override fun hasNext(): Boolean {
                return nowDate <= end
            }
            override fun next(): MyDate {
                val result = nowDate
                nowDate = nowDate.nextDay()
                return result
            }

        }
    }


}



fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}