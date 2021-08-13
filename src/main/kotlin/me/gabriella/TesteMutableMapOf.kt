package me.gabriella

fun main(){

    val nome = ""
    val Gabriella = Funcionario(nome: "Gabriella", salario: 3000.0, tipoContratacao: "CLT")
    val Ellen = Funcionario(nome: "Ellen", salario: 1000.0, tipoContratacao: "PJ")
    val Michele = Funcionario(nome: "Michele", salario: 2800.0, tipoContratacao: "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Gabriella.nome, Gabriella)
    repositorio.create(Ellen.nome, Ellen)
    repositorio.create(Michele.nome, Michele)

    println(repositorio.findById(Gabriella.nome))

    println("----")
    repositorio.findAll().forEach {
        val it = ""
        println(it)
    }

    println("----")
    repositorio.remove(Gabriella.nome))
    repositorio.findAll().forEach{
        val it = ""
        println(it)
    }

}