package exercicio2.DLC

import exercicio2.Acessorio

class LancaMisteriosa : Acessorio {
    override fun descricao() = "Lança Misteriosa - Aumenta o ataque em 20"
    override fun tipoBonus() = 1
    override fun aplicarBonus() = 20
}