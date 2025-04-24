package exercicio4

import java.util.*

class Pedido(private val id: Int) {
    private val tempoProcessamento = Random().nextInt(3000) + 2000

    fun getId() = id
    fun getTempoProcessamento() = tempoProcessamento
}