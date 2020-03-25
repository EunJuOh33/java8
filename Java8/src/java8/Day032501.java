package java8;

public class Day032501 {
	public static void main(String[] args) {
		/*
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@
		 * 형태 만들기
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			System.out.println();
		} 
		System.out.println();
		
		
		/* 반전 */
		for(int i=4; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 좌우반전
		 * 	    @
		 * 	   @@
		 *    @@@
		 *   @@@@
		 *  @@@@@
		 */
		for(int i=4; i>=0; i--) {
			for(int j=0; j<5; j++) {
				if(i>j ) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		
		/* 반전 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>j ) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 *     @
		 *    @@@  
		 *   @@@@@
		 *  @@@@@@@
		 * @@@@@@@@@    만드는 방법은 여러가지
		 */
		for(int i=4; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("@");
			}
			for(int j=0; j<4-i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		/* 한 줄 없애고 반전 */
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<4-i; j++) {	// 4-i에서 한 줄에 하나 지워준다. 밑에도 마찬가지.
				System.out.print("@");
			}
			for(int j=0; j<3-i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
