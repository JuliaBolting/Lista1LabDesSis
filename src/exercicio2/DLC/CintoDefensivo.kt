package exercicio2.DLC

import exercicio2.Acessorio

class CintoDefensivo : Acessorio {
    override fun descricao() = "Cinto Defensivo - Aumenta a defesa em 25"
    override fun tipoBonus() = 2
    override fun aplicarBonus() = 25
}