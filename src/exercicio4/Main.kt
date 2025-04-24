package exercicio4

fun main() {
    val pedidos = List(5) { Pedido(it + 1) }

    val threads = pedidos.map { pedido ->
        val thread = Thread(ProcessadorPedido(pedido))
        thread.start()
        thread
    }

    threads.forEach { it.join() }

    println("Todos os pedidos foram processados!")
}