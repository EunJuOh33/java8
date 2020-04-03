package Day0403;

public class ArrayExceptionEx {
	public static void main(String[] args) { 
		exceptionTest();
	}
	
	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr [2] = 100;	//���ܰ� �߻��ϸ� �Ʒ����� �ڵ带 �������� �ʰ� �ٷ� catch ������ �Ѿ��.
			System.out.println(arr[2]);
//			throw new NullPointerException();
//			throw new ArrayIndexOutOfBoundsException(); 	//���������� ���ܸ� �߻���Ű����
															//��ü�� �����ؼ�  throw �մϴ�.
		} catch(ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ������ �Ұ����ϰų� �迭�� ������ ������ϴ�.");
		} catch(Exception e) {		//Exception�� ��� ���� ó���̱� ������ ���� �������� ����մϴ�.
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
			e.printStackTrace();
		} finally {	//���ܿ� ������� ������ �����ϴ� �����Դϴ�. ���������մϴ�.
			System.out.println("finally �����Դϴ�.");
		}
		
		try {
			Thread.sleep(1000);;	//����ó�� ���̴� ������ �Ұ����� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
