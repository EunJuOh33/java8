package java8;

public class Day032502 {
	public static void main(String[] args) {
		/*
		 * 1부터 25까지 5칸 5줄로 출력하세요.
		 */
		
		/* 방법 1 */
		for(int i=1; i<=25; i++) {
			System.out.print(i + "\t");
			if(i%5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		/* 방법 2 */
		int cnt = 1;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("%02d ", cnt);
				cnt++;
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 01 02 03 04 05	0
		 * 10 09 08 07 06	10	
		 * 11 12 13 14 15	20
		 * 20 19 18 17 16	30
		 * 21 22 23 24 25	40
		 */
/*		cnt = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i % 2 == 0) {
					System.out.print(cnt + "\t");
				} else {
					System.out.println((i+1)*5-j + "\t");
				}
			}
			System.out.println();
		}
*/		
		
		/*
		 * @
		 *  @
		 *   @
		 *    @
		 *     @
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i == j) {
					System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
