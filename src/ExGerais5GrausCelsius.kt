//Ler uma temperatura em graus Celsius e apresentá-la convertida em
//graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
//a temperatura em Fahrenheit e C a temperatura em Celsius.

fun main() {
    conversaoF()
}

fun leituraC(): Int{
    println("Digite a temperatura em Graus Celsius: ")
    val celsius = readln().toInt()

    return celsius
}

fun conversaoF(){
    val celsius = leituraC()
    val fahre = ((9*celsius)+160)/5

    println("A temperatura solicitada equivale à $fahre em Fahrenheits")
}