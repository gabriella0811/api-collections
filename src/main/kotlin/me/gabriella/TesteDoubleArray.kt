package me.gabriella

fun main(){
    val size = 0
    val salarios = DoubleArray(size: 3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach{
        val it = ""
        println(it)

    }

        salarios.forEachIndexed{
            index, salario ->
            salarios[index] = salario * 1.1
        }

    salarios.forEach{
        val it = ""
        println(it)

    }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0).also {

        val it = null.apply {
            sort()
        }
    }
    salarios2.forEach{
        val it = ""
        println(it)
        }
}