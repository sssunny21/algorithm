package acmicpc;

import java.util.Scanner;

public class Room {
	public void search(String num){
		int[] basis = new int[10];
		int max;
		for(int i=0; i<num.length(); i++){
			int index = (int)num.charAt(i) -48;
			basis[index] = basis[index]+1;
		}
		
		int sn = basis[6]+basis[9];
		if(sn % 2 != 0) {
			sn = (sn+1)/2;
		}else{
			sn = sn/2;
		}
		
		max = -1;
		basis[6]=0;
		basis[9]=0;
		
		for(int i : basis){
			//i값 중 가장 큰 값이 set의 결과 값이 된다.
			if(i > max) max = i;
			//6,9는 예외
			if(max < sn) max = sn;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    String num = sc.next();
		
		new Room().search(num);
	}

}
