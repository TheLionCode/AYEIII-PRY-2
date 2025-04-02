import java.io.File
import java.util.Arrays

//MAIN
fun printLadosGrafo(g: Grafo) {
    for (e in g) {
	println("e: ${e}")
    }   
}

fun main(args: Array<String>) {
    val archivo1 = "grafo3.txt"

    println("Grafo desde archivo")
    val g1 = GrafoDirigido(archivo1)
    println(g1.dfs_rw())

}