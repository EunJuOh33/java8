package Day0330;

public class Computer {
	int sum(int[] arr) {
		int sum = 0;
		for(int i=0; 1<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
		
	int sum2(int... arr) {	//가변형 - 매개변수의 개수가 바뀔 수 있다.
							//가변형 인자는 배열로 자동 형변환이 된다.
		int sum = 0;
		for(int i=0; 1<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}	
}
