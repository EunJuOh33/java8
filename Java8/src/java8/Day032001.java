package java8;


public class Day032001 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i=1; i<=100; i++) {
			sum +=i;
		}
		
		System.out.println("1부터 10까지의 합: " + sum);	//5050
	}
}	