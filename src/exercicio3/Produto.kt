package exercicio3

class Produto (private val titulo: String, private val valor: Double, private val categoria: String){
    fun getTitulo() = titulo
    fun getValor() = valor
    fun getCategoria() = categoria
}