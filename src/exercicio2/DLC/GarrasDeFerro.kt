package exercicio2.DLC

import exercicio2.Acessorio

class GarrasDeFerro : Acessorio {
    override fun descricao() = "Garras de Ferro - Aumenta o ataque em 60"
    override fun tipoBonus() = 1
    override fun aplicarBonus() = 60
}