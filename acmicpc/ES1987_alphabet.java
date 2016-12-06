package acmicpc;
import java.util.Arrays;
import java.util.Scanner;
public class ES1987_alphabet {
	Scanner sc = new Scanner(System.in);
	private static final int ALPHABET_LENGTH = 26;

	private static final int[][] DIR = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	private static final int DIR_X = 1;
	private static final int DIR_Y = 0;

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();

		char[][] board = new char[r][c];
		for (int i = 0; i < r; i++) {
			board[i] = sc.next().toCharArray();
		}

		boolean[] visit = new boolean[ALPHABET_LENGTH];
		System.out.println(search(visit, board, r, c, 0, 0, 0));
	}

	private int search(boolean[] visit, char[][] board, int r, int c, int y, int x, int m) {
		if (x < 0 || y < 0 || x >= c || y >= r) return 0;
		System.out.println(board[y][x]-'A');
		System.out.println(visit[board[y][x]-'A']);
		if (visit[board[y][x] - 'A']) return 0;
		visit[board[y][x] - 'A'] = true;

		int max = 0;
		for (int i = 0; i < DIR.length; i++) {
			boolean[] v = Arrays.copyOf(visit, ALPHABET_LENGTH);
			int tmp = search(v, board, r, c, y + DIR[i][DIR_Y], x + DIR[i][DIR_X], m + 1);
			if (tmp > max) max = tmp;
		}
		return max + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES1987_alphabet().solve();
	}

}
