package Day0330;

public class ComputerEx {
	public static void main(String[] args) {
		Computer com = new Computer();
		int[] arr1 = {10, 20, 30};
		int res1 = com.sum(arr1);
		System.out.println(res1);	//60
		
		int res2 = com.sum(new int[]{10, 20, 30, 40, 50});	//객체 형태로 만들어야 메소드에 대입할 수 있다.
		System.out.println(res2);
		
		int res3 = com.sum2(arr1);
		System.out.println(res3);
		
		int res4 = com.sum2(new int[]{10, 20, 30, 40, 50});	//가변형 인자에 배열이 대입될 수 있다.
		System.out.println(res4);
		
		int res5 = com.sum2(10,20,30,40,50);
		System.out.println(res5);
		
//		int res6 = com.sum(10,20,30);	//오류.
		
	}
}
