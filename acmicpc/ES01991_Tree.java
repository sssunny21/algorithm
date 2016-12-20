package acmicpc;

import java.util.Scanner;

public class ES01991_Tree {
	private static final Scanner sc = new Scanner(System.in);
	
	private static final String UPPER_ALPHABET = ".ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private void solve(){
		int n = sc.nextInt(); //노드의 갯수
		int[][] tree = new int[UPPER_ALPHABET.length()][2];
		
		for(int i = 0; i < n; ++i){
			int p = get(sc.next());
			tree[p][0] = get(sc.next());
			tree[p][1] = get(sc.next());
		}
		
		System.out.print("전위 : ");
		preorder(tree,1);
		System.out.println();
		System.out.print("중위 : ");
		inorder(tree,1);
		System.out.println();
		System.out.print("후위 : ");
		postorder(tree,1);
	}
	
	private void preorder(int[][] tree, int i){
		if(i == 0) return;
		System.out.print(UPPER_ALPHABET.charAt(i));
		preorder(tree,tree[i][0]);
		preorder(tree,tree[i][1]);
	}
	
	private void inorder(int[][] tree, int i){
		if(i == 0) return;
		inorder(tree,tree[i][0]);
		System.out.print(UPPER_ALPHABET.charAt(i));
		inorder(tree,tree[i][1]);
	}
	
	private void postorder(int[][] tree, int i){
		if(i == 0) return;
		postorder(tree,tree[i][0]);
		postorder(tree,tree[i][1]);
		System.out.print(UPPER_ALPHABET.charAt(i));
	}
	private int get(String p){
		return UPPER_ALPHABET.indexOf(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01991_Tree().solve();
	}

}
