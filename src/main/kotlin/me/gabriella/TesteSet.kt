package me.gabriella

fun main(){
    val nome = ""
    val Gabriella = Funcionario(nome: "Gabriella", salario: 3000.0, tipoContratacao: "CLT")
    val Ellen = Funcionario(nome: "Ellen", salario: 1000.0, tipoContratacao: "PJ")
    val  Michele = Funcionario(nome: "Michele", salario: 2800.0, tipoContratacao: "CLT")

    val funcionarios1 = setOf(Gabriella, Ellen)
    val funcionarios2 = setOf(Michele)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach {
        println(it)
    }

    println("----")
    val funcionarios3 = setOf(Gabriella, Ellen, Michele)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach {
        println(it)
    }

    println("----")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach {
        println(it)
    }
}