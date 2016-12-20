package acmicpc;

import java.util.*;

public class ES09012_VPS {
	private static final Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int testcase = sc.nextInt();
		for(int i = 0; i < testcase; i++){
			String s = sc.next();
			while(true){
				if(s.contains("()")) s = s.replace("()", "");
				else if(s.length() == 0){
					System.out.println("YES");
					break;
				}else{
					System.out.println("NO");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES09012_VPS().solve();
	}

}
