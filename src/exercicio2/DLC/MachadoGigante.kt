package exercicio2.DLC

import exercicio2.Acessorio

class MachadoGigante : Acessorio {
    override fun descricao() = "Machado Gigante - Aumenta o ataque em 100"
    override fun tipoBonus() = 1
    override fun aplicarBonus() = 100
}