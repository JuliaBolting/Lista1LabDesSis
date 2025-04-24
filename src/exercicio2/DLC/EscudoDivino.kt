package exercicio2.DLC

import exercicio2.Acessorio

class EscudoDivino : Acessorio {
    override fun descricao() = "Escudo Divino - Aumenta a defesa em 70"
    override fun tipoBonus() = 2
    override fun aplicarBonus() = 70
}