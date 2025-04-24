package exercicio2.DLC

import exercicio2.Acessorio

class ArmaduraPesada : Acessorio {
    override fun descricao() = "Armadura Pesada - Aumenta a defesa em 40"
    override fun tipoBonus() = 2
    override fun aplicarBonus() = 40
}