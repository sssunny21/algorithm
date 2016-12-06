package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class ES1463_makeOne {
	/**탑다운방식**/
	/**
	final static int max = 13;
	static int[] dp = new int[max];
	
	int solve(int n){		
		if(n == 1) return 0;
		if(dp[n] != -1) return dp[n];
		
		int result = solve(n-1)+1;
		if(n % 3 == 0)
			result = Math.min(result, solve(n/3)+1);
		if(n % 2 == 0)
			result = Math.min(result, solve(n/2)+1);
		
		dp[n] = result;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Arrays.fill(dp, -1);
		System.out.println(new ES1463_makeOne().solve(N));
		
	}**/
	/**바텀업방식**/
	final static int max = 1000001;
	
	public static void main(String[] args) {
		int N;
		int[] dp = new int[max];
		
		
	}
}
