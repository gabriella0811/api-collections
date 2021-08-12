package me.gabriella

fun main(){
    val nome = ""
    val Gabriella = Funcionario(nome: "Gabriella", salario: 3000.0, tipoContratacao: "CLT")
    val Ellen = Funcionario(nome: "Ellen", salario: 1000.0, tipoContratacao: "PJ")
    val  Michele = Funcionario(nome: "Michele", salario: 2800.0, tipoContratacao: "CLT")

    val funcionarios = listOf(Gabriella , Ellen, Michele)


    funcionarios.forEach{
        println(it)
    }

    println("----")
    println(funcionarios.find { it.nome == "Ellen" })

    println("----")
    funcionarios.sortedBy { it.salario }
        .forEach {
            println(it)
        }

    println("----")
    funcionarios.groupBy { it.tipoContratacao }
        .forEach {
            println(it)
        }
}