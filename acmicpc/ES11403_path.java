package acmicpc;

import java.util.LinkedList;
import java.util.Scanner;

public class ES11403_path {
	private static final Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int n = sc.nextInt();
		
		boolean[][] a = new boolean[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = (sc.nextInt() == 1) ? true:false;
			}
		}
		
		for(int i = 0; i < n; i++){
			boolean[] v = new boolean[n];
			search(a, v, n, i);
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.println(a[i][j] ? "1 ":"0 ");
			}
			System.out.println();
		}
	}
	
	private void search(boolean[][] a, boolean[] v, int n, int i){
		LinkedList<Integer> stack = new LinkedList<>();
		for(int k = 0; k < n; k++){
			if(a[i][k] && !v[k]) stack.add(k);
		}
		while(true){
			if(stack.isEmpty()) return;
			
			int tmp = stack.pop();
			a[i][tmp] = true;
			v[tmp] = true;
			
			for(int k = 0; k < n; k++){
				if(a[tmp][k] && !v[k]) stack.add(k);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES11403_path().solve();
	}

}
