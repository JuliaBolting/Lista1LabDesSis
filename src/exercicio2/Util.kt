package exercicio2

import java.io.File
import java.net.URLClassLoader
import kotlin.reflect.full.*

class Util {
    fun carregarAcessorioDinamicamente(nomeClasse: String): Acessorio? {
        return try {
            val diretorioDLC = File("C:\\Users\\Julia\\IdeaProjects\\Lista1LabDesSis\\src\\exercicio2\\DLC")

            if (!diretorioDLC.exists() || !diretorioDLC.isDirectory) {
                println("Diretório DLC não encontrado ou inválido")
                return null
            }

            val url = diretorioDLC.toURI().toURL()
            val classLoader = URLClassLoader(arrayOf(url))
            val classe = classLoader.loadClass("exercicio2.DLC.$nomeClasse").kotlin
            val instancia = classe.primaryConstructor?.call() as? Acessorio
            instancia
        } catch (e: Exception) {
            println("Erro ao carregar acessório: ${e.message}")
            null
        }
    }
}