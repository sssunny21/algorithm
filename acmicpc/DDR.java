package acmicpc;

import java.util.*;

public class DDR {
	ArrayList<Integer> input;
	int left;
	int right;
	int power;
	Scanner sc = new Scanner(System.in);

	void min_power(){
		input = new ArrayList<Integer>();

		while(true){
			int a = sc.nextInt();
			if(a == 0) break;
			input.add(a);
		}

		left = input.get(0);
		right = 0;
		power = 2;

		for(int i = 1; i < input.size(); i++){
			int l_space = Math.abs(input.get(i) - left);
			int r_space = Math.abs(input.get(i) - right);

			if(right == 0){
				right = input.get(i);
				power += 2;
			}else{
				if(input.get(i-1) == input.get(i)){
					power += 1;
				}else{
					if(r_space == 2 && l_space != 2){
						left = input.get(i);
						power += 3;
					}else if(l_space == 2 && r_space != 2){
						right = input.get(i);
						power += 3;
					}else{
						left = input.get(i);
						power += 4;
					}
				}
			}
		}
		System.out.println(power);

	}

	public static void main(String[] args) {
		new DDR().min_power();
	}

}
