package acmicpc;

import java.util.LinkedList;
import java.util.Scanner;

public class ES1935_postfix2 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static final char ADDITION = '+';
	private static final char SUBTRACTION = '-';
	private static final char MULTIPLICATION = '*';
	private static final char DIVISION = '/';
	
	private void solve(){
		int n = sc.nextInt();
		char[] fomula = sc.next().toCharArray();
		double[] number = new double[n];
		for(int i = 0; i < n; i++){
			number[i] = sc.nextInt();
		}
		
		LinkedList<Double> stack = new LinkedList<>();
		for(int i = 0; i < fomula.length; i++){
			int idx = UPPERCASE_ALPHABET.indexOf(fomula[i]);
			if(idx == -1){
				double tmp = operate(stack.removeLast(), stack.removeLast(),fomula[i]);
				stack.add(tmp);
			}else{
				stack.add(number[idx]);
			}
		}
		System.out.println(String.format("%.2f", stack.pop()));
	}
	
	private double operate(double operandRight, double operandLeft, char operator){
		switch(operator){
		case ADDITION :
			return operandLeft + operandRight;
		case SUBTRACTION :
			return operandLeft - operandRight;
		case MULTIPLICATION :
			return operandLeft * operandRight;
		case DIVISION :
			return operandLeft / operandRight;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		new ES1935_postfix2().solve();
	}

}
