package Day0414;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIO {
	public static void main(String[] args) throws IOException {
		byte[] data = {21, 1, 43, 12, 76, 34, 54, 29, 66, 99};	// �迭 ����
		RandomAccessFile rac = new RandomAccessFile("temp.txt", "rw");
		rac.write(data);	// �����͸� �д´�.
		System.out.println("���� ��� : temp.txt");
		System.out.println("-----------------");
		
		for(int i=0; i<data.length; i++) {
			int accepoint = (int)((Math.random() * 100) % 10); 	// 0 ~ 9 ����
			rac.seek(accepoint);
			System.out.print("���� ���� ������ : " + rac.getFilePointer());	// ���� �����Ͱ� �� ������ �˷��ش�.
			System.out.println(", ������ : " + rac.read());
		}
	}
}
