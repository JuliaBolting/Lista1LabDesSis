package exercicio2.DLC

import exercicio2.Acessorio

class EscudoMagico : Acessorio {
    override fun descricao() = "Escudo Mágico - Aumenta a defesa em 50"
    override fun tipoBonus() = 2
    override fun aplicarBonus() = 50
}