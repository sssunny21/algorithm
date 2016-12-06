package acmicpc;

import java.util.Scanner;

public class ES1254_addPalindrom {
	private static final Scanner sc = new Scanner(System.in);
	
	private void solve(){
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++){
			String result = create(s,i);
			if(isPalindrom(result)) {
				System.out.println(s.length());
				System.out.println(s.length()+i);
				return;
			}
		}
		
		
	}
	
	private boolean isPalindrom(String s){
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length() -1 -i))
				return false;
		}
		return true;
		
	}
	
	private String create(String s, int n){
		StringBuilder str = new StringBuilder(s);
		for(int i = n-1; i >= 0; i--){
			str.append(s.charAt(i));
		}//n-1부터 i가 0이상일 때
		return str.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES1254_addPalindrom().solve();
	}

}
