package acmicpc;

import java.util.*;

public class ES01021_QueueRotate {
	private static final Scanner sc = new Scanner(System.in);
	
	/**내가 한 것.. 답은 나오는데 백준에서는 틀렸다고함... **/
	/**
	private void solve(){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] location = new int[m];
		int count = 0;
		int count2 = 0 - m;
		for(int i = 0; i < m; i++){
			location[i] = sc.nextInt();
		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		LinkedList<Integer> queue2 = new LinkedList<>();

		for(int i = 1; i < n + 1; i++){
			queue.add(i);
			queue2.add(i);
		}
		int k = 0;
		for(int i = 0; i < m; i++){
			if(location[i] == queue.get(k)){
				k++;
			}else{
				leftRotate(queue);
				i--;
				count++;
				k = 0;
			}
		}
		
		k = 0;
		for(int i = 0; i < m; i++){
			if(location[i] == queue2.get(k)){
				k++;
			}else{
				rightRotate(queue2);
				i--;
				count2++;
				k = 0;
			}
		}
		if(count2 < 0) count2 = 0;
		if(count < count2) System.out.println(count);
		else System.out.println(count2);
	}
	
	private void leftRotate(LinkedList<Integer> queue){
		int first = queue.removeFirst();
		queue.add(first);
	}
	
	private void rightRotate(LinkedList<Integer> queue2){
		int last = queue2.removeLast();
		queue2.addFirst(last);
	}
	**/
	
	private void solve(){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++){
			queue.add(i);
		}
		
		int sum = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < queue.size(); j++){
				int tmp = queue.removeFirst();
				if(tmp == a[i]){
					int k = queue.size() - j + 1;
					sum += min(j, k);
					break;
				}else queue.add(tmp);
			}
		}
		System.out.println(sum);
	}
	
	private int min(int i, int j){
		return i < j ? i : j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01021_QueueRotate().solve();
	}

}
