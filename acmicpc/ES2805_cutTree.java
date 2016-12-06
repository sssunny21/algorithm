package acmicpc;

import java.util.Scanner;

public class ES2805_cutTree {
	int N; //나무의 수
	int M; // 
	int[] height;
	Scanner sc = new Scanner(System.in);

	void solve(){
		N = sc.nextInt();
		M = sc.nextInt();
		height = new int[N];
        for(int i = 0; i < N; i++) height[i] = sc.nextInt();
        int lo = 0; int hi = 1000000000;
        
        while(lo+1 < hi){
        	int mid = (lo+hi)/2; // 기준
        	long sum = 0;
        	for(int i = 0; i < N; i++){
        		if(height[i] > mid) sum += height[i] - mid;
        	}
        	if(sum >= M) lo = mid;
        	else hi = mid;
        }
        System.out.println(lo);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES2805_cutTree().solve();
	}

}
