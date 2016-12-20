package acmicpc;

import java.util.Scanner;

public class ES01747_primeNumANDPalindrom {
	
	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 150;
	private static final int MAX = 150;

	private void solve() {
		int n = sc.nextInt();
		int[] prime = new int[SIZE];
		int k = init(prime); // prime의 크기.

		System.out.println(search(n, prime, k));
	}

	private int search(int n, int[] prime, int k) {
		for (int i = 0; i < k; i++) {
			if (prime[i] < n) continue;
			if (palindrom(prime[i])) return prime[i]; // 펠린드롬 함수에서 true인 prime[i] 값을 리턴한다.
		}
		return MAX;
	}

	private boolean palindrom(int n) {
		char[] str = Integer.toString(n).toCharArray();
		for (int i = 0; i < str.length / 2; i++) {
			if (str[i] != str[str.length - i - 1]) return false;
		}
		return true;
	}// 펠린드롬인지 검사.

	private int init(int[] prime) {
		boolean[] p = new boolean[SIZE];
		int k = 0;
		for (int i = 2; i < SIZE; i++) {
			if (!p[i]) {
				prime[k++] = i;
				update(p, i);
			}
		} // 이과정을 통해 prime배열에 소수 목록 저장.
		return k;
	}

	private void update(boolean[] p, int k) {
		for (int i = k; i < SIZE; i += k) {
			p[i] = true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES01747_primeNumANDPalindrom().solve();
	}

}
