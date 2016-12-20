package acmicpc;

import java.util.Scanner;

public class ES01213_makePalindrome {
	private static final Scanner sc = new Scanner(System.in);

	private static final String LARGE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private void solve(){
		String s = sc.nextLine(); //�Է¹��� ��
		StringBuilder result = new StringBuilder();
		
		String middle = null;
		
		for(int i = 0; i < LARGE_ALPHABET.length(); i++){
			String letter = LARGE_ALPHABET.substring(i, i+1);
			int tmp = s.length() - s.replaceAll(letter, "").length();
			
			if(tmp % 2 != 0){ //tmp�� Ȧ����
				if(middle == null){
					middle = letter;
				}else{//�Ӹ���� ����°� �Ұ��� �� ��
					System.out.println("I'm Sorry Hansoo");
					return;
				}
			}
			
			if(tmp > 0){
				String sub = s.replaceAll("[^"+letter+"]", "");
				if(tmp % 2 != 0) sub = sub.substring(1);
				result.insert(result.length()/2, sub);
			}
		}
		
		if(middle != null) result.insert(result.length()/2, middle);
		System.out.println(result.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01213_makePalindrome().solve();
	}

}
