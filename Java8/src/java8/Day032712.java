package java8;

public class Day032712 {
	public static void main(String[] args) {
		/* ��ø�� for���� ����Ͽ� 2���� �迭�� �������� ����
		 * ȭ�鿡 ����ϴ� ���α׷�
		 */
		int arr[][] = new int[8][9];
		
		for(int i=0; i<=arr.length; i++) {
			for(int j=1; j<=arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print((i+2) + "x" + (j+1) + "=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//������ �� �� ���� �� �� �ִ�.
		int[][] ary = new int[10][10];
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = i * j;
			}
		}
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.print(i + "x" + j + "=" + ary[i][j] + "\t");
			}
			System.out.println();
		}
	}
}