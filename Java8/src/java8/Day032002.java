package java8;

public class Day032002 {
	public static void main(String[] args) {
		int sum = 0;
//		int index = 0;
		
		for(int index=1; index<=100; index = index + 1
				) {
			sum += index;
		}

		System.out.println("1���� 100������ ��: " + sum);
//		System.out.println("���� index�� ��: " +index);
	}
}
