package me.gabriella

fun main(){
    val salarios = doubleArrayOf(1000.0 , 4000.0 , 2000.0)

    for (salario in salarios){
        println(salario)
    }

    println("----")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menos salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter { it > 2000 }
    me.gabriella.println("----")
    salariosMaiorQue2000.forEach{
        println(it)
    }

    println("----")
    println(salarios.count{ it in 2000.0 .. 5000.0 })

    println("----")
    println(salarios.find{ it == 2000.0 })

    println("----")
    println(salarios.any { it == 1000.0 })

}
