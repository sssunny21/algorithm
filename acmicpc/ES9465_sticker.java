package acmicpc;

import java.util.Arrays;
import java.util.Scanner;

public class ES9465_sticker {
	int T;
	int n;
	int max = 10;
	int[][] value;
	int[][] dp;

	void solve(){
		value = new int[2][max];
		dp = new int[max][3];
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for(int i = 0; i < T; i++){
			n = scan.nextInt();
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < n; k++){
					value[j][k] = scan.nextInt();
				}
			}
		}
		for(int i=0; i<n; i++){
			dp[i+1][0] = Math.max(dp[i+1][0], Math.max(dp[i][0], Math.max(dp[i][1], dp[i][2])));
			dp[i+1][1] = Math.max(dp[i+1][1], Math.max(dp[i][0], dp[i][2]) + value[0][i]);
			dp[i+1][2] = Math.max(dp[i+1][2], Math.max(dp[i][0], dp[i][1]) + value[1][i]);
		}
		System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));

	}

	public static void main(String[] args) {
		new ES9465_sticker().solve();
	}
}
