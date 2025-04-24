package exercicio2

interface Acessorio {
    fun descricao(): String
    fun tipoBonus(): Int // 1 para ataque, 2 para defesa
    fun aplicarBonus(): Int
}