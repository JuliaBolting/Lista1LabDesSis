package exercicio2.DLC

import exercicio2.Acessorio

class PerolaNegra: Acessorio {
    override fun descricao() = "Pérola Negra - Aumenta a defesa em 15"
    override fun tipoBonus() = 2
    override fun aplicarBonus() = 15
}