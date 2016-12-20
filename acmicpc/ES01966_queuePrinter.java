package acmicpc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ES01966_queuePrinter {
	/** ���� �߿䵵�� ������ �� ��� �ϴ� �� ��...�� ...������... **/
	/**
	private final static Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int max = -1;
			int search = 0;
			
			LinkedList<Integer> queue = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				queue.add(sc.nextInt());
				if(max < queue.getLast()) max = queue.getLast();
			}
			
			search = queue.get(m);
			do{
				for (int j = 0; j < n; j++){
					if(queue.getFirst() < queue.get(j)){
						queue.add(queue.getFirst());
						queue.removeFirst();
					}
					if(queue.getFirst() == max) {
						searchPrint(queue,search);
						break;
					}
				}
			}while(queue.getFirst() != max);
		}
	}
	
	private void searchPrint(LinkedList<Integer> queue, int search){
		for (int j = 0; j < queue.size(); j++) {
			if(queue.get(j) == search) 
				System.out.println(j+1);
		}
	}
	**/
	private final static Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			LinkedList<Integer> queue = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				queue.add(sc.nextInt());
			}
			Integer[] order = queue.toArray(new Integer[n]); //toArray()�� ����Ÿ���� Integer�� �����ϱ� ���� ���°�.
			Arrays.sort(order);
			
			int printed = 0;
			while(m >= 0) {
				int tmp = queue.pop();
				System.out.println("tmp"+tmp);
				if(isImportant(tmp, order, n, printed)){
					printed++;
				}else{
					queue.add(tmp);
					if(m == 0){
						m = n - printed;
					}
				}
				m--;
			}
			System.out.println(printed);
		}
	}
	
	private boolean isImportant(int tmp, Integer[] order, int n, int printed) {
		if(tmp == order[n - printed - 1]) return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01966_queuePrinter().solve();
	}

}
