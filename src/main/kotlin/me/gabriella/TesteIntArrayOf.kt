package me.gabriella

fun main(it: Int) {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    val forEach1 = this.forEach {
        println(it)
    }

    values.run {

        forEach{
        println(it)
    }

        sort()
    }
    val forEach = this.forEach {
        println(it)
    }

}