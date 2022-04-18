//Escrever um programa que leia o nome de um vendedor, o seu
//salário fixo e o total de vendas efetuadas por ele no mês (em
//dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
//suas vendas efetuadas, informar o seu nome, o salário fixo e salário
//no final do mês
fun main() {
    cadastroVendedor()
}

fun cadastroVendedor(){
    println("Digite o nome do vendedor:")
    val nome = readln()

    println("Digite o salário fixo de $nome")
    val salario = readln().toDouble()

    println("Digite o valor total de vendas que $nome fez este mês:")
    val vendas = readln().toDouble()

    calculoVendas(nome, salario, vendas)
}

fun calculoVendas(nome: String, salario: Double, vendas: Double) {
    val comissao = (vendas*15)/100
    val salarioFinal = comissao+salario
    val nome = nome

    exibirDados(salarioFinal, nome, salario)
}

fun exibirDados(salarioFinal: Double, nome: String, salario: Double) {
    println("-----------------")
    println("Vendedor: $nome")
    println("Salário Fixo: $salario")
    println("Salário com Comissão: $salarioFinal")
}