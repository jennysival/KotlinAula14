import kotlin.system.exitProcess

//Escrever um programa que leia o nome de N alunos e as notas das
//três provas que ele obteve no semestre. No final informar o nome do
//aluno e a sua média (aritmética)
//Obs: use vetores para a resolução do exercício

fun main() {
    cadastroAluno()
}

fun cadastroAluno(){
    println("Digite o nome do(a/e) aluno(a/e):")
    val NomeAluno = readln()

    val notas = IntArray(3)
    for (i: Int in notas.indices){
        println("Digite a ${i+1}ª nota de $NomeAluno:")
        notas[i] = readln().toInt()
    }

    calculoMedia(NomeAluno, notas)
}

fun calculoMedia(NomeAluno: String, notas: IntArray) {
    var soma=0

    for(i: Int in notas.indices){
        soma = soma+notas[i]
    }

    val media = soma/3

    println("A média de notas de $NomeAluno foi: $media")

    OpcAdicionarNovoAluno()
}

fun OpcAdicionarNovoAluno(){
    println("-----------------------------------------")
    println("Deseja adicionar um novo(a/e) aluno(a/e)?")
    println("1) SIM")
    println("2) NÃO")
    println("-----------------------------------------")
    println("Digite apenas o número da opção escolhida:")
    val opc = readln().toInt()

    when(opc){
        1 -> cadastroAluno()
        2 -> exitProcess(0)
        else -> println("Seleção Inválida")
    }
}

