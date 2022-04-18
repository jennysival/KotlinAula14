//Faça um programa que receba o preço de custo de um produto e
//mostre o valor de venda. Sabe-se que o preço de custo receberá um
//acréscimo de acordo com um percentual informado pelo usuário.

fun main() {
    cadastroDoProduto()
}

fun cadastroDoProduto(){
    println("Digite o preço de custo do produto:")
    val custo = readln().toDouble()

    println("Digite o percentual de lucro do produto:")
    val lucro = readln().toDouble()

    valorDeVenda(custo, lucro)
}

fun valorDeVenda(custo: Double, lucro: Double) {
    val venda = ((custo*lucro)/100)+custo
    println("O valor de venda final do produto será: $venda")
}