package exercicio2

fun main() {
    val util = Util()

    val personagens = mutableListOf<Personagem>()

    val campeao1 = Personagem("GUERREIRO", 30, 10, 100)
    println("${campeao1.nome}\nAtaque: ${campeao1.ataque}\nDefesa: ${campeao1.defesa}\nHP: ${campeao1.vida}")
    campeao1.adicionarAcessorio(util.carregarAcessorioDinamicamente("AtaqueVoador")!!)
    campeao1.adicionarAcessorio(util.carregarAcessorioDinamicamente("EscudoMagico")!!)
    personagens.add(campeao1)
    println()

    val campeao2 = Personagem("ARQUEIRO", 25, 12, 100)
    println("${campeao2.nome}\nAtaque: ${campeao2.ataque}\nDefesa: ${campeao2.defesa}\nHP: ${campeao2.vida}")
    campeao2.adicionarAcessorio(util.carregarAcessorioDinamicamente("EspadaFlamejante")!!)
    campeao2.adicionarAcessorio(util.carregarAcessorioDinamicamente("CintoDefensivo")!!)
    personagens.add(campeao2)
    println()

    val campeao3 = Personagem("MAGO", 15, 8, 100)
    println("${campeao3.nome}\nAtaque: ${campeao3.ataque}\nDefesa: ${campeao3.defesa}\nHP: ${campeao3.vida}")
    campeao3.adicionarAcessorio(util.carregarAcessorioDinamicamente("LancaMisteriosa")!!)
    campeao3.adicionarAcessorio(util.carregarAcessorioDinamicamente("PerolaNegra")!!)
    personagens.add(campeao3)
    println()

    val campeao4 = Personagem("BÁRBARO", 35, 15, 100)
    println("${campeao4.nome}\nAtaque: ${campeao4.ataque}\nDefesa: ${campeao4.defesa}\nHP: ${campeao4.vida}")
    campeao4.adicionarAcessorio(util.carregarAcessorioDinamicamente("GarrasDeFerro")!!)
    campeao4.adicionarAcessorio(util.carregarAcessorioDinamicamente("EscudoDivino")!!)
    personagens.add(campeao4)
    println()

    val campeao5 = Personagem("PALADINO", 40, 20, 100)
    println("${campeao5.nome}\nAtaque: ${campeao5.ataque}\nDefesa: ${campeao5.defesa}\nHP: ${campeao5.vida}")
    campeao5.adicionarAcessorio(util.carregarAcessorioDinamicamente("MachadoGigante")!!)
    campeao5.adicionarAcessorio(util.carregarAcessorioDinamicamente("EscudoMagico")!!)
    personagens.add(campeao5)
    println()

    val campeao6 = Personagem("LADINO", 28, 10, 100)
    println("${campeao6.nome}\nAtaque: ${campeao6.ataque}\nDefesa: ${campeao6.defesa}\nHP: ${campeao6.vida}")
    campeao6.adicionarAcessorio(util.carregarAcessorioDinamicamente("EspadaFlamejante")!!)
    campeao6.adicionarAcessorio(util.carregarAcessorioDinamicamente("CintoDefensivo")!!)
    personagens.add(campeao6)
    println()

    val campeao7 = Personagem("NECROMANTE", 18, 9, 100)
    println("${campeao7.nome}\nAtaque: ${campeao7.ataque}\nDefesa: ${campeao7.defesa}\nHP: ${campeao7.vida}")
    campeao7.adicionarAcessorio(util.carregarAcessorioDinamicamente("LancaMisteriosa")!!)
    campeao7.adicionarAcessorio(util.carregarAcessorioDinamicamente("PerolaNegra")!!)
    personagens.add(campeao7)
    println()

    val campeao8 = Personagem("CAVALEIRO", 32, 15, 100)
    println("${campeao8.nome}\nAtaque: ${campeao8.ataque}\nDefesa: ${campeao8.defesa}\nHP: ${campeao8.vida}")
    campeao8.adicionarAcessorio(util.carregarAcessorioDinamicamente("AtaqueVoador")!!)
    campeao8.adicionarAcessorio(util.carregarAcessorioDinamicamente("EscudoDivino")!!)
    personagens.add(campeao8)
    println()

    val campeao9 = Personagem("DRUIDA", 20, 12, 100)
    println("${campeao9.nome}\nAtaque: ${campeao9.ataque}\nDefesa: ${campeao9.defesa}\nHP: ${campeao9.vida}")
    campeao9.adicionarAcessorio(util.carregarAcessorioDinamicamente("GarrasDeFerro")!!)
    campeao9.adicionarAcessorio(util.carregarAcessorioDinamicamente("EscudoMagico")!!)
    personagens.add(campeao9)
    println()

    val campeao10 = Personagem("SOMBRA", 25, 8, 100)
    println("${campeao10.nome}\nAtaque: ${campeao10.ataque}\nDefesa: ${campeao10.defesa}\nHP: ${campeao10.vida}")
    campeao10.adicionarAcessorio(util.carregarAcessorioDinamicamente("MachadoGigante")!!)
    campeao10.adicionarAcessorio(util.carregarAcessorioDinamicamente("CintoDefensivo")!!)
    personagens.add(campeao10)

    for (i in 0..<personagens.size step 2) {
        if (i + 1 < personagens.size) {
            val personagem1 = personagens[i]
            val personagem2 = personagens[i + 1]
            println("\nBatalha entre ${personagem1.nome} e ${personagem2.nome}:")
            personagem1.luta(personagem2)
        }
    }
}