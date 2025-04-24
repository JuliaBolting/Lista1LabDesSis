package exercicio2.DLC

import exercicio2.Acessorio

class EspadaFlamejante : Acessorio {
    override fun descricao() = "Espada Flamejante - Aumenta o ataque em 30"
    override fun tipoBonus() = 1
    override fun aplicarBonus() = 30
}