import java.io.File
import java.util.Arrays

//MAIN
fun printLadosGrafo(g: Grafo) {
    for (e in g) {
	println("e: ${e}")
    }   
}

fun main(args: Array<String>) {
    val archivo1 = "pertGraph.txt"

    val endings: IntArray = intArrayOf(2, 11, 17, 23)

    val hitos = mapOf(
        2 to "Development",
        11 to "Closed Beta", 
        17 to "Open Beta",
        23 to "General Release"
    )
    
    println("Diagrama de PERT")
    val gl = GrafoDirigidoCosto(archivo1)
    val results = gl.dijkstra(1, endings)
    
    results.forEachIndexed { index, cost ->
        val vertex = endings[index]
        val milestone = hitos[vertex] ?: "Unknown Milestone"
        println("$milestone -> $cost - Completed")
    }
}