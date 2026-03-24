package Day14;
import java.util.*;
public class ShortestPathUnweighted {
    ArrayList<ArrayList<Integer>> graph;
    int V;
    ShortestPathUnweighted(int V){
        this.V=V;
        graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void shortestPath(int src){
        int[] dist=new int[V];
        Arrays.fill(dist,-1);
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        dist[src]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nei: graph.get(node)){
                if(dist[nei]==-1){
                    dist[nei]=dist[node]+1;
                    q.offer(nei);
                }
            }
        }
        System.out.println("Shortest distance from node "+src+":");
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        int V=5;
        ShortestPathUnweighted g=new ShortestPathUnweighted(V);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,3);
        g.addEdge(3,4);

        g.shortestPath(0);

    }
}
