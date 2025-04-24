package exercicio1

fun main() {
    val dupla1 = Dupla(10, "Olá")

    val dupla2 = Dupla(3.14, true)

    val dupla3 = Dupla(8, 62)

    println("Dupla 1")
    try {
        dupla1.exibirDupla()
        dupla1.trocarValores()
        dupla1.exibirDupla()
    } catch (e: IllegalArgumentException) {
        println("Erro ao tentar trocar valores da primeira dupla: ${e.message}")
    }

    println("Dupla 2")
    try {
        dupla2.exibirDupla()
        dupla2.trocarValores()
        dupla2.exibirDupla()
    } catch (e: IllegalArgumentException) {
        println("Erro ao tentar trocar valores da segunda dupla: ${e.message}")
    }

    println("Dupla 3")
    try {
        dupla3.exibirDupla()
        dupla3.trocarValores()
        dupla3.exibirDupla()
    } catch (e: IllegalArgumentException) {
        println("Erro ao tentar trocar valores da terceira dupla: ${e.message}")
    }
}