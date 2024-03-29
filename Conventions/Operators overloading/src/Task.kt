import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(repeatedTimeInterval: RepeatedTimeInterval): MyDate =
        addTimeIntervals(repeatedTimeInterval.timeInterval, repeatedTimeInterval.number)


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}

private operator fun TimeInterval.times(i: Int)= RepeatedTimeInterval(this, i)

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)