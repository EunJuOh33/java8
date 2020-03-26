package java8;

public class Day032608 {
	public static void main(String[] args) {
		int arr1[] = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		/* 실수 타입 */
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();	// 0.0 0.0 0.0
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		
		/* boolean 타입 */
		boolean[] arr3 = new boolean[3];
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);	// false false false
		}
		System.out.println();
		
		arr3[0] = true;
		arr3[1] = false;
		arr3[2] = true;
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();
		
		
		/* String 타입 */
		String[] arr4 = new String[3];
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();	//null null null
		
		arr4[0] = "봄";
		arr4[1] = "여름";
		arr4[2] = "가을";
		for(int i=0; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();
	}
}
