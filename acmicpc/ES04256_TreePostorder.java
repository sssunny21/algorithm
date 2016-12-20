package acmicpc;

import java.util.Scanner;

/**���� 4256��
 * ����,���� ��ȸ �׽�Ʈ ���̽��� �־����� �� Ʈ���� ������ȸ�� ����� ����ϴ� ����**/
public class ES04256_TreePostorder {
	private static final Scanner sc = new Scanner(System.in);
	
	private void solve(){
		int testcase = sc.nextInt();
		
		for(int i = 0; i < testcase; ++i){
			int n = sc.nextInt(); //����� ����
			
			int[] preorder = new int[n];
			int[] inorder = new int[n];
			
			for(int j = 0; j < n; ++j){
				preorder[j] = sc.nextInt();
			}
			for(int j = 0; j < n; ++j){
				inorder[j] = sc.nextInt();
			}
			
			int[] postorder = new int[n];
			postOrder(n, preorder, inorder, postorder, 0, n-1, 0, n-1, n-1);
			
			for(int j = 0; j < n; ++j){
				System.out.print(postorder[j]+" ");
			}
			System.out.println();
		}
	}
	
	private int postOrder(int n, int[] pre, int[] in, int[] post, int ps, int pe, int is, int ie, int i) {
		//������ȸ �Ųٷ� ä��� ��Ʈ-��-��
		if (ps > pe || is > ie) return i + 1;
		if (ps < 0 || pe < 0 || ps >= n || pe >= n) return i + 1;
		if (is < 0 || ie < 0 || is >= n || ie >= n) return i + 1;
		if (i < 0 || i >= n) return i + 1;
		
		post[i] = pre[ps];
		int root_index = searchRoot(pre[ps],in,is,ie);
		int t = ps - is + root_index; // ���� ���غҰ�....��....
		i = postOrder(n,pre,in,post,t+1,pe,root_index+1,ie,--i);//������
		i = postOrder(n,pre,in,post,ps+1,t,is,root_index-1,--i);//����
		
		return i;
	}

	private int searchRoot(int root, int[] in, int start, int end){
		for(int i = start; i <= end; ++i){
			if(in[i] == root) return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ES04256_TreePostorder().solve();
	}

}
