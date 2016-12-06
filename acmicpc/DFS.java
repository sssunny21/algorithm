package acmicpc;

import java.util.*;

public class DFS {
	private static int[][] map;
	private static boolean[] visited;
	private static int maxLength;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		int start = 0;
		int end = 0;
		
		map = new int[N+1][N+1];
		maxLength = map.length;
		visited = new boolean[maxLength];
		
		for(int i=1; i<N+1; i++){
			for(int j=1; j<N+1; j++){
				map[i][j]=0;
			}
		}
		
		for(int i=0; i<M;i++){
			start = sc.nextInt();
			end = sc.nextInt();
			
			map[start][end]=1;
			map[end][start]=1;
		}
		
		initVisited();
		dfs(V);
		System.out.println();
		initVisited();
		bfs(V);
		
	}
	private static void initVisited(){
		for(int i=0; i<maxLength; i++){
			visited[i] = false;
		}
	}
	
	private static void dfs(int v){
		visited[v] = true;
		System.out.println(v + " ");
		for(int i=0; i<maxLength; i++){
			if((map[v][i]==1)&&!visited[i]){
				dfs(i);
			}
		}
	}
	
	private static void bfs(int v){
		visited[v] = true;
		System.out.println(v + " ");
		Queue q = new LinkedList();
		
		q.add(v);
		while(q.size() > 0){
			v = (int)q.peek();
			for(int i = 1; i < maxLength; i++){
				if((map[v][i] == 1) && !visited[i]){
					q.add(i);
					visited[i] = true;
					System.out.println(i+" ");
				}
				q.remove(v);
			}
			
		}
	}

}
