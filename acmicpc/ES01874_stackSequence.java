package acmicpc;

import java.util.Scanner;
import java.util.LinkedList;

public class ES01874_stackSequence {
	/** No 출력 어떻게 하는지 모르겠어서 다른 사람 코드 복붙..
	private final static Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int n = sc.nextInt();
		int[] sequence = new int[n];
		
		for(int i = 0; i < n; i++){
			sequence[i] = sc.nextInt();	
		}
		Stack<Integer> stack = new Stack<Integer>();
		int i = 1;
		int j = 0;
		StringBuilder sb = new StringBuilder();
		while(true){
			if(stack.isEmpty() || stack.peek() < sequence[j]){
				stack.push(i);
				sb.append("+\n");
				i++;
			}else if(stack.peek() > sequence[j]){
				System.out.println("NO");
				return;
			}
			if(stack.peek() == sequence[j]){
				while(stack.peek() == sequence[j]){
					stack.pop();
					sb.append("-\n");
					j++;
					if(stack.isEmpty()) break;
				}
				
			}
			if(stack.size() == 0) break;
		}
		System.out.println(sb.toString());
	}
	**/
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final String PUSH = "+\n";
	private static final String POP = "-\n";
	
	private void solve(){
		int n = sc.nextInt();
		LinkedList<Integer> stack = new LinkedList<>();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int i = 1;
		int j = 0;
		
		StringBuilder stringBuilder = new StringBuilder();
		while(j != n){
			if (stack.isEmpty() || stack.getLast() < a[j]){
				for (; a[j] >= i; i++) {
					stack.add(i);
					stringBuilder.append(PUSH);
				}
			} else if (stack.getLast() == a[j]) {
				stack.removeLast();
				stringBuilder.append(POP);
				j++;
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println(stringBuilder.toString());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01874_stackSequence().solve();
	}

}
