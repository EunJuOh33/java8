package java8;

public class Day032606 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50};
		int[] [] ary1 = { {10, 20}, {30, 40}, {50, 60}, {70, 80}};	//new int[4][2];�� ������ �ǹ�
		
		System.out.println(ary1.length);	//ù��° ��ȣ�� ũ�⸦ ��Ÿ����. 4
		System.out.println(ary1[0].length);	//2
		System.out.println(ary1[1].length);	//2
		System.out.println(ary1[2].length);	//2
		System.out.println(ary1[3].length);	//2
//		System.out.println(ary1[4].length);	//4�� ����. ����
		
		for(int i=0; i<ary1.length; i++) {			//ary1.length�� ���� 4. i<4�� �־ ��
			for(int j=0; j<ary1[i].length; j++) {	//ary1[i].length�� ���� 2. j<2�� �־ ��
				System.out.println(ary1[i][j]);
			}
		}
		System.out.println();
		
		int[][] ary2 = {{10,20,30}, {40}, {50,60}};
		for(int i=0; i<ary2.length; i++) {
			for(int j=0; j<ary2[i].length; j++) {	//�迭�� ���̰� �ٸ� ��쿡�� length�� ����ؾ� �Ѵ�.
				System.out.println(ary2[i][j]);
			}
		}
	}
}
