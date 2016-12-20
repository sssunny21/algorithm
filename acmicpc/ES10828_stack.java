package acmicpc;

import java.util.Scanner;
import java.util.Stack;

public class ES10828_stack {
	
	private final static Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int n = sc.nextInt();
		Stack stack = new Stack();
		String[] order = new String[n];
		
		for(int i = 0; i < n+1; i++){
			order[i] = sc.nextLine();
		}
		
		for(int i = 1; i < n+1; i++){
			if(order[i].contains("push")){
				stack.push(order[i].substring(5));
			}else if(order[i].equals("pop")){
				if(stack.size() > 0){
					System.out.println(stack.peek());
					stack.pop();
				}else System.out.println("-1");
			}else if(order[i].equals("top")){
				if(stack.size() > 0) System.out.println(stack.peek());
				else System.out.println("-1");
			}else if(order[i].equals("size")){
				System.out.println(stack.size());
			}else if(order[i].equals("empty")){
				System.out.println(stack.isEmpty() ? 1 : 0);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES10828_stack().solve();
	}
}
