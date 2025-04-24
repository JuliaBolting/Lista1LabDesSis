package exercicio1

class Dupla<T, U>(private var primeiro: T, private var segundo: U) {

    fun setPrimeiro(primeiro: T) {
        this.primeiro = primeiro
    }

    fun setSegundo(segundo: U) {
        this.segundo = segundo
    }

    fun getPrimeiro(): T {
        return primeiro
    }

    fun getSegundo(): U {
        return segundo
    }

    fun trocarValores() {
        if (primeiro!!::class == segundo!!::class) {
            val temp = primeiro
            primeiro = segundo as T
            segundo = temp as U
            println("Valores trocados com sucesso!")
        } else {
            throw IllegalArgumentException("Não é possível trocar valores de tipos diferentes.")
        }
    }

    fun exibirDupla() {
        println("Dupla: [$primeiro, $segundo]")
    }
}