package Day0331;

import java.awt.List;
import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		int number = 10;
		/* �ڽ� */
		Integer iBox = new Integer(number);	//�Ű������� �⺻�� �Ǵ� ���ڿ��� �Է��� �� �ִ�.
		Integer iBox2 = Integer.valueOf(iBox);
		
		/* ��ڽ� */
		number = iBox.intValue();
		
		/* �ڵ� �ڽ� */
		Integer iBox3 = number;
		
		/* �ڵ� ��ڽ� */
		int res = iBox3 + 10;
		System.out.println(res);	//20
		
		List<Integer> list = new ArrayList();
	}
}
