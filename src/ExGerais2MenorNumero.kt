//Faça um programa que receba uma quantidade X de números e
//imprimir o menor número (suponha números diferentes) entre eles.
//Obs: use vetores para a resolução do exercício

fun main() {
    compararNumeros()
}

fun receberNumeros(): IntArray{
    println("Quantos números deseja inserir?")
    val tamanho = readln().toInt()

    val vetorNumeros = IntArray(tamanho)

    for(i: Int in vetorNumeros.indices){
        println("Digite o ${i+1}º número:")
        vetorNumeros[i] = readln().toInt()
    }

    return vetorNumeros
}

fun compararNumeros(){
    val vetorNumeros = receberNumeros()

    var menor = vetorNumeros[0]
    var maior = 0

    for(i: Int in vetorNumeros.indices){
        if (vetorNumeros[i] > maior){
            maior = vetorNumeros[i]
        }
        else if (vetorNumeros[i] < menor){
            menor = vetorNumeros[i]
        }
    }
    println("O menor valor é: $menor")
}