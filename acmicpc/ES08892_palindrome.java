package acmicpc;

import java.util.Scanner;

public class ES08892_palindrome {
	private static final Scanner sc = new Scanner(System.in);
	private static final String IMPOSSIBLE_PALINDROM = "0";
	
	private void solve(){
		int testcase = sc.nextInt();
		for(int t = 0; t < testcase; t++){
			int n = sc.nextInt();
			String[] s = new String[n];
			for(int i = 0; i < n; i++){
				s[i] = sc.next();
			}
			System.out.println(palindrom(s, n));
		}
	}
	
	private String palindrom(String[] s, int n){
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i != j && isPalindrom(s[i]+s[j]))
					return s[i]+s[j];
			}
		}
		return IMPOSSIBLE_PALINDROM;
	}
	
	private boolean isPalindrom(String s){
		int length = s.length();
		for(int i = 0; i < length/2; i++){
			if(s.charAt(i) != s.charAt(length - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES08892_palindrome().solve();
	}

}
