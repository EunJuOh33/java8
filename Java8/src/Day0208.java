
public class Day0208 {

	public static void main(String[] args) {
		int dice = 0;	//����� ���ÿ� �ʱ�ȭ�� �ϸ� ���Ŀ� ������ ���� �� �ִ�.
		dice = (int)(Math.random() * 6) + 1;	//Math.random()�� 0���� ũ�ų� ���� 1���� ���� �Ǽ�(double)�� ���� (�Ǽ�). �Ǽ��� �������� �� ũ��.
		//����ȯ�� ��Ģ���꺸�� �켱�մϴ�.
		//dice 0~5 => 1~6
		System.out.println(dice);
	}

}
