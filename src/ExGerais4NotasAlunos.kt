//Escrever um programa que leia o nome de N alunos e as notas das
//três provas que ele obteve no semestre. No final informar o nome do
//aluno e a sua média (aritmética)
//Obs: use vetores para a resolução do exercício

fun main() {

}

fun cadastroAlunos(){
    println("Quantos alunos deseja cadastrar?")
    val qtdAlunos = readln().toInt()

    val nomeAlunos = arrayOfNulls<String>(qtdAlunos)

    for(i: Int in nomeAlunos.indices){
        println("Digite o nome do ${i+1}º aluno:")
        nomeAlunos[i] = readln()
    }

    cadastroNotas(qtdAlunos, nomeAlunos)
}

fun cadastroNotas(qtdAlunos: Int, nomeAlunos: Array<String?>) {

}

