//Faça um algoritmo que contenha uma função para ler as dimensões de
//um retângulo (base e altura), calcular e imprimir para o usuário a área do
//retângulo;
fun main() {
    recebeDados()
}

fun recebeDados(){
    println("Digite a base:")
    val baseDig = readln().toInt()

    println("Digite a altura:")
    val alturaDig = readln().toInt()

    calculaAreaRetangulo(baseDig, alturaDig)
}

fun calculaAreaRetangulo(base: Int, altura: Int){
    val area = base*altura
    println("A área do retângulo é: $area")
}



