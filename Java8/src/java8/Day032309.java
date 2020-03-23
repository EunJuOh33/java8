package java8;

public class Day032309 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i <=50; i++) {
			sum += i;
		}
		double avg = sum / 50D;
		System.out.println("1부터 50까지의 합의 평균:" + avg);
	}
}
