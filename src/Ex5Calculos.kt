//Escreva um programa que receba dois números e ao final mostre a
//soma, subtração, multiplicação e a divisão dos números lidos.
fun main() {
    calculos()
}

fun inserirNumeros(): IntArray{
    val numeros = IntArray(2)

    for(i: Int in numeros.indices){
        println("Digite um número:")
        numeros[i] = readln().toInt()
    }

    return numeros
}

fun calculos(){
    val numeros = inserirNumeros()
    val num1 = numeros[0]
    val num2 = numeros[1]

    val soma = num1+num2
    val subtracao = num1-num2
    val multi = num1*num2
    val divis = num1/num2

    mostraResultado(num1, num2, soma, subtracao, multi, divis)
}

fun mostraResultado(num1: Int, num2: Int, soma: Int, subtracao: Int, multi: Int, divis: Int) {
    println("$num1 + $num2 = $soma")
    println("$num1 - $num2 = $subtracao")
    println("$num1 x $num2 = $multi")
    println("$num1 / $num2 = $divis")
}