package java8;

public class Day032606 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50};
		int[] [] ary1 = { {10, 20}, {30, 40}, {50, 60}, {70, 80}};	//new int[4][2];와 동일한 의미
		
		System.out.println(ary1.length);	//첫번째 괄호의 크기를 나타낸다. 4
		System.out.println(ary1[0].length);	//2
		System.out.println(ary1[1].length);	//2
		System.out.println(ary1[2].length);	//2
		System.out.println(ary1[3].length);	//2
//		System.out.println(ary1[4].length);	//4는 없다. 오류
		
		for(int i=0; i<ary1.length; i++) {			//ary1.length의 값은 4. i<4를 넣어도 됨
			for(int j=0; j<ary1[i].length; j++) {	//ary1[i].length의 값은 2. j<2를 넣어도 됨
				System.out.println(ary1[i][j]);
			}
		}
		System.out.println();
		
		int[][] ary2 = {{10,20,30}, {40}, {50,60}};
		for(int i=0; i<ary2.length; i++) {
			for(int j=0; j<ary2[i].length; j++) {	//배열의 길이가 다를 경우에는 length를 사용해야 한다.
				System.out.println(ary2[i][j]);
			}
		}
	}
}
