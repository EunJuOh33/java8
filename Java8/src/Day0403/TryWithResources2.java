package Day0403;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {
	public void getData(String file) {
		Scanner sc = null;
		try(
				Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in); 
			){											//�ڵ����� ������ �ϴ� ������  �Ұ�ȣ�� �̿��� �Ű�����ó�� ��ȣ �ȿ� �ִ´�.
														//���� ���� �ڵ� ���� �ڵ带 �ۼ��� �� �ִ�.
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("���� �߻�");
			System.err.println();
			e.getMessage();
			System.err.println();
			e.printStackTrace();
		} finally {	//����� ��Ʈ���� ������ �ݱ� ���ؼ� finally ������ �̿�(1.6 ����)
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public static void main(String[] args) {
		TryWithResources2 twr = new TryWithResources2();
		twr.getData("test.txt");
	}
}
