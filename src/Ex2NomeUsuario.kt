//Faça um algoritmo que contenha uma função que receba o nome de um
//usuário e retorne a mensagem Meu nome é <NomeDigitado>.
fun main() {
    receberNome()
}

fun receberNome(){
    println("Digite seu nome:")
    val nome = readln()

    println("Meu nome é $nome")
}