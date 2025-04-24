package exercicio4

class ProcessadorPedido(private val pedido: Pedido) : Runnable {
    override fun run() {
        println("Processando pedido ${pedido.getId()}")
        Thread.sleep(pedido.getTempoProcessamento().toLong())
        println("Pedido ${pedido.getId()} processado com sucesso!")
    }
}