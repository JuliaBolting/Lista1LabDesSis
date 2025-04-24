package exercicio2

class Personagem(val nome: String, var ataque: Int, var defesa: Int, var vida: Int) {
    private val acessorios = mutableListOf<Acessorio>()

    fun adicionarAcessorio(acessorio: Acessorio) {
        acessorios.add(acessorio)
        println("${acessorio.descricao()} adicionado a $nome")
    }

    private fun atacar(): Int {
        val bonusAtaque = acessorios.filter { it.tipoBonus() == 1 }.sumOf { it.aplicarBonus() }
        val danoTotal = ataque + bonusAtaque
        println("$nome atacou com força total de $danoTotal")
        return danoTotal
    }

    private fun defender(dano: Int): Int {
        val bonusDefesa = acessorios.filter { it.tipoBonus() == 2 }.sumOf { it.aplicarBonus() }
        val defesaTotal = defesa + bonusDefesa
        val danoFinal = maxOf(0, dano - defesaTotal)
        vida -= danoFinal
        println("$nome defendeu com força total de $defesaTotal")
        println("$nome recebeu $danoFinal de dano. Vida restante: $vida")
        return danoFinal
    }

    private fun estaVivo(): Boolean {
        return vida > 0
    }

    fun luta(adversario: Personagem) {
        var vezDoAtacar = true

        while (estaVivo() && adversario.estaVivo()) {
            if (vezDoAtacar) {
                val dano = atacar()
                adversario.defender(dano)
            } else {
                val dano = adversario.atacar()
                defender(dano)
            }
            vezDoAtacar = !vezDoAtacar
        }

        if (estaVivo()) {
            println("$nome VENCEU A BATALHA!")
        } else {
            println("${adversario.nome} VENCEU A BATALHA!")
        }
    }
}