package das.assign;

public class BellmanFord {
	public static void main(String[] args) {
		
	}
	
	public static void Bellman(int[][] graph, int start) {
		Edge[] edges = new Edge[count(graph)];
		int cntr = 0;
			for(int i = 0; i < graph.length; i++) {
				for(int j = 0; j < graph.length; j++) {
					if(graph[i][j] != Integer.MAX_VALUE) {
						edges[cntr].start = i;
						edges[cntr].end = j;
						edges[cntr].weight = graph[i][j];
						cntr++;
					}
				}
			}
			
		int[] dist = new int[graph.length];
		int[] prev = new int[dist.length];
			for(int k = 0; k < dist.length; k++) {
				dist[k] = Integer.MAX_VALUE;
			}
		dist[start] = 0;
		prev[start] = -1;
			for(int ctr = 0; ctr < (graph.length - 1); ctr++) {
				for(int ed = 0; ed < edges.length; ed++) {
					if(dist[])
				}
			}
	}
	
	public static int count(int[][] graph) {
		int cntr = 0;
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph.length; j++) {
				if(graph[i][j] != Integer.MAX_VALUE) cntr++;
			}
		}
		return cntr;
	}
}
