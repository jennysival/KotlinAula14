//Faça um algoritmo que contenha um método que receba um número do
//usuário e realize a somatória de todos os números no intervalo de 1 até o
//número digitado pelo usuário. Exiba o resultado da somatória.

fun main() {
    somatoriaDeNumeros()
}

fun receberNumero(): Int{
    println("Digite um número:")
    val numeroDigitado = readln().toInt()

    return numeroDigitado
}

fun somatoriaDeNumeros(){
    val numeroDigitado = receberNumero()

    var soma=0
    for(i in 0..numeroDigitado){
        soma = soma+i
    }

    println("A soma de 1 até $numeroDigitado é: $soma")
}