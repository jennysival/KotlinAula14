//Elaborar um programa que efetue a apresentação do valor da
//conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
//deverá solicitar o valor da cotação do dólar e também a quantidade
//de dólares disponíveis com o usuário. Considere que o valor do dólar
//está em R$4,00.

fun main() {
    conversaoReal()
}

fun entradaDeValor(): Double{
    println("Digite quantos dólares(US$) deseja converter para real(R$):")
    val dolar = readln().toDouble()

    return dolar
}

fun conversaoReal(){
    val cotacaoAtual: Double = 4.0

    val dolar = entradaDeValor()

    val real = dolar*cotacaoAtual

    println("Você acabou de converter US$$dolar em R$$real")
}