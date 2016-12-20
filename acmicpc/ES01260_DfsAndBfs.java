package acmicpc;

import java.util.*;

public class ES01260_DfsAndBfs {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int root = sc.nextInt();
		
		boolean[][] graph = new boolean[n + 1][n + 1];
		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = true;
			graph[b][a] = true;
		}
		
		boolean[] dfs = new boolean[n + 1];
		boolean[] bfs = new boolean[n + 1];
		bfs[root] = true;
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(root);
		System.out.println(dfs(dfs,graph,n,root,new StringBuilder()));
		System.out.println(bfs(bfs,graph,n,queue,new StringBuilder()));
	}
	
	private StringBuilder dfs(boolean[] dfs, boolean[][] graph, int n, int node, StringBuilder stringBuilder){
		dfs[node] = true;
		stringBuilder.append(node).append(" ");
		
		for(int i = 1; i <= n; i++){
			if(graph[node][i] && !dfs[i]) dfs(dfs,graph,n,i,stringBuilder);
		}
		return stringBuilder;
	}
	
	private StringBuilder bfs(boolean[] bfs, boolean[][] graph, int n, LinkedList<Integer> queue, StringBuilder stringBuilder){
		if(queue.isEmpty()) return stringBuilder;
		int node = queue.pop();
		stringBuilder.append(node).append(" ");
		
		for(int i = 1; i <= n; i++){
			if(graph[node][i] && !bfs[i]){
				queue.add(i);
				bfs[i] = true;
			}
		}
		return bfs(bfs,graph,n,queue,stringBuilder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01260_DfsAndBfs().solve();
	}

}
