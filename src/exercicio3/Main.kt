package exercicio3

import java.util.Comparator

fun main() {
    val produtos = listOf(
        Produto("Celular", 1200.0, "Eletrônicos"),
        Produto("Geladeira", 900.0, "Eletrodomésticos"),
        Produto("Notebook", 5000.0, "Eletrônicos"),
        Produto("Mesa", 250.0, "Móveis"),
        Produto("Livro", 80.0, "Livros")
    )

    // Filtrar produtos com preço maior que 100
    val produtosCaros = produtos.stream()
        .filter { it.getValor() > 100 }
        .toList()

    println("Produtos acima de 100:")
    produtosCaros.forEach { println("${it.getTitulo()} - R$${it.getValor()}") }

    // Exibir apenas os nomes dos produtos da categoria "Eletrônicos"
    val eletronicos = produtos.stream()
        .filter { it.getCategoria() == "Eletrônicos" }
        .map { it.getTitulo() }
        .toList()

    println("\nProdutos da categoria Eletrônicos:")
    eletronicos.forEach { println(it) }

    // Ordenar os produtos por preço em ordem decrescente
    val produtosOrdenados = produtos.stream()
        .sorted(Comparator.comparingDouble<Produto?> { it.getValor() }.reversed())
        .toList()

    println("\nProdutos ordenados por preço (decrescente):")
    produtosOrdenados.forEach { println("${it.getTitulo()} - R$${it.getValor()}") }

}