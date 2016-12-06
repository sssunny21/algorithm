package acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class password_9933 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String result = "";
		
		String[] words = null;
		StringBuffer sb = new StringBuffer();
		StringBuffer[] rw = null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			words = line.split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<words.length;i++){
			sb.append(words[i]);
			rw[i] = sb.reverse();
			sb.delete(0, sb.length());
		}

		System.out.println(rw.length);
		int index = (int) Math.ceil(sb.length()/2);
		System.out.println(sb.charAt(index));

	}

}
