package Day0330;

public class Computer {
	int sum(int[] arr) {
		int sum = 0;
		for(int i=0; 1<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
		
	int sum2(int... arr) {	//������ - �Ű������� ������ �ٲ� �� �ִ�.
							//������ ���ڴ� �迭�� �ڵ� ����ȯ�� �ȴ�.
		int sum = 0;
		for(int i=0; 1<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}	
}
