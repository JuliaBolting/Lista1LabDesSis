package exercicio2.DLC

import exercicio2.Acessorio

class AtaqueVoador : Acessorio {
    override fun descricao() = "Ataque Voador - Aumenta o ataque em 50"
    override fun tipoBonus() = 1
    override fun aplicarBonus() = 50
}