import java.util.*

public fun DIJKSTRA(start: Int, graph: Grafo) {
    val n = graph.obtenerNumeroDeVertices()
    val dist = DoubleArray(n + 1) { Double.MAX_VALUE } // +1 because vertices are 1-based in the graph classes
    dist[start] = 0.0
    
    val pq = PriorityQueue<Pair<Int, Double>>(compareBy { it.second })
    pq.offer(Pair(start, 0.0))
    
    while (pq.isNotEmpty()) {
        val (u, d) = pq.poll()
        if (d > dist[u]) continue
        
        when (graph) {
            is GrafoDirigidoCosto -> {
                for (arc in graph.adyacentes(u)) {
                    val v = arc.sumidero()
                    val w = arc.costo()
                    if (dist[v] > dist[u] + w) {
                        dist[v] = dist[u] + w
                        pq.offer(Pair(v, dist[v]))
                    }
                }
            }
            is GrafoNoDirigidoCosto -> {
                for (edge in graph.adyacentes(u)) {
                    val v = if (edge.u == u) edge.v else edge.u
                    val w = edge.costo
                    if (dist[v] > dist[u] + w) {
                        dist[v] = dist[u] + w
                        pq.offer(Pair(v, dist[v]))
                    }
                }
            }
            else -> throw IllegalArgumentException("Unsupported graph type")
        }
    }
    
    println(dist.contentToString())
}