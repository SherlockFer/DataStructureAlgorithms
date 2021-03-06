package DijkstraShortestPathAlgorithm;

// What's the time complexity?

//Our initialization involves a constant amount of work per node, plus inserting O(N)O(N) nodes into priorityQueue will take O(N*lg(N))O(N∗lg(N)) time. (Priority queues are built on heaps, which have O(\lg{n})O(lgn) insertions ↴ ) That's O(N*lg(N))O(N∗lg(N)) time overall for all the initialization work.
//We'll go through the loop O(N)O(N) times, and each time we call removeMin(), taking O(lg(N))O(lg(N)) time (assuming a heap-based priority queue). Over the entire algorithm, that's O(N*lg(N))O(N∗lg(N)) time.
//We'll update costInQueue once per edge, or O(M)O(M) times. Each priority queue update costs O(lg(N))O(lg(N)) time. That's O(M*lg(N))O(M∗lg(N)) time overall.
// with minimum edges in a graph  
// A Java program for Dijkstra's single source shortest path algorithm. 
// The program is for adjacency matrix representation of the graph 
  
public class SPAAlgorithm {

    static class Graph{
        int vertices;
        int matrix[][];

        public Graph(int vertex) {
            this.vertices = vertex;
            matrix = new int[vertex][vertex];
        }

        public void addEdge(int source, int destination, int weight) {
            //add edge
            matrix[source][destination]=weight;

            //add back edge for undirected graph
            matrix[destination][source] = weight;
        }
        //getMinimumVertex
        int getMinimumVertex(boolean[] sptset,int[] distance){
            int min=Integer.MAX_VALUE;
            int min_vert=-1;
            for(int vert=0;vert<vertices;vert++){
                if(sptset[vert]==false && distance[vert]<=min){
                    min=distance[vert];
                    min_vert=vert;
                }
            }
            return min_vert;
        }

        public void dijkstra_GetMinDistances(int sourceVertex){
            boolean[]  spt=new boolean[vertices];
            int[] distance=new int[vertices];
            int INFINITY=Integer.MAX_VALUE;
            
            for (int i = 0; i < vertices; i++) {
                spt[i]=false;
                distance[i]=INFINITY;
            }
            
            distance[sourceVertex]=0;

            //create SPT
            for (int i = 0; i <vertices ; i++) {

                //get the vertex with the minimum distance
                int vertex_U = getMinimumVertex(spt, distance);

                //include this vertex in SPT
                spt[vertex_U] = true;

                //iterate through all the adjacent vertices of above vertex and update the keys
                for (int vertex_V = 0; vertex_V <vertices ; vertex_V++) {
                    //check of the edge between vertex_U and vertex_V
                    if(matrix[vertex_U][vertex_V]>0){
                        //check if this vertex 'vertex_V' already in spt and
                        // if distance[vertex_V]!=Infinity

                        if(spt[vertex_V]==false && matrix[vertex_U][vertex_V]!=INFINITY){
                            //check if distance needs an update or not
                            //means check total weight from source to vertex_V is less than
                            //the current distance value, if yes then update the distance

                            int newKey =  matrix[vertex_U][vertex_V] + distance[vertex_U];
                            if(newKey<distance[vertex_V])
                                distance[vertex_V] = newKey;
                        }
                    }
                }
            }
            //print shortest path tree
            printDijkstra(sourceVertex, distance);
        }

        public void printDijkstra(int sourceVertex, int [] key){
            System.out.println("Dijkstra Algorithm: (Adjacency Matrix)");
            for (int i = 0; i <vertices ; i++) {
                System.out.println("Source Vertex: " + sourceVertex + " to vertex " +   + i +
                        " distance: " + key[i]);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        int sourceVertex = 2;
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.dijkstra_GetMinDistances(sourceVertex);
    }
}