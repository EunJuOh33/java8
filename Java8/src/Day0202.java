import java.util.Scanner;

public class Day0202 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	//s �ڸ��� ���ϴ� ��ĳ�� �̸�. ��ĳ�ʸ� �ۼ��ϼ���.
		
		int number1, number2, result;	//int�� ���� number1�� number2�� �����ϼ���.
		
		System.out.println("number1�� number2�� ���� ���ʴ�� �־��ּ���.");	//ȭ�鿡 number1��  number2�� ���� �Է��ϵ��� �ȳ������� ����� �ּ���.
		System.out.println("�����̳� ����Ű�� ���� ������ �ּ���.");
		
		number1 = s.nextInt();	//�ۼ��� ��ĳ�ʷ�  number1��  number2�� ���� �Է��ϼ���.
		number2 = s.nextInt();
		
		result = number1 + number2;	//�հ踦 ȭ�鿡 ����� �ּ���.
		System.out.print("�� ���� �հ�� ");
		System.out.print(result);
		System.out.print("�Դϴ�.");
		//number1���� 10�� �����ϰ� number2���� 20�� �����ؼ� ������� 30���� ��µǾ�� �մϴ�.
		
		s.close();	//��ĳ�ʸ� �ݾ��ּ���.		
	}
}
