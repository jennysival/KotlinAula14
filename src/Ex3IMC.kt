//Faça um algoritmo que contenha uma função que calcule o IMC de um
//usuário a partir da inserção do seu peso e de sua altura. Exiba a
//classificação do usuário após a verificação do seu IMC.
//
//IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
//MENOR QUE 18,5 MAGREZA 0
//ENTRE 18,5 E 24,9 NORMAL 0
//ENTRE 25,0 E 29,9 SOBREPESO I
//ENTRE 30,0 E 39,9 OBESIDADE II
//MAIOR QUE 40,0 OBESIDADE GRAVE III

fun main() {
    exibirResultados()
}

fun receberDados(): DoubleArray{
    val pesoAltura = DoubleArray(2)

    println("Digite seu peso (ex: 70.5):")
    pesoAltura[0] = readln().toDouble()

    println("Digite sua altura (ex: 1.70):")
    pesoAltura[1] = readln().toDouble()

    return pesoAltura
}

fun calculoIMC(): Double{
    val pesoAltura = receberDados()
    val peso = pesoAltura[0]
    val altura = pesoAltura[1]

    val calculo = peso/(altura*altura)

    return calculo
}

fun exibirResultados(){
    val imc = calculoIMC()

    if(imc < 18.5){
        println("Você está abaixo do seu peso ideal: Magreza")
    }
    else if(imc in 18.5..24.9){
        println("Você está em seu peso ideal: Normal")
    }
    else if(imc in 24.9..29.9){
        println("Você está acima do seu peso ideal: Sobrepeso")
    }
    else if(imc in 29.9..39.9){
        println("Você está acima do seu peso ideal: Obesidade")
    }
    else{
        println("Você está acima do seu peso ideal: Obesidade Grave")
    }
}