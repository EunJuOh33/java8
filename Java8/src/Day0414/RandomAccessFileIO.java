package Day0414;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIO {
	public static void main(String[] args) throws IOException {
		byte[] data = {21, 1, 43, 12, 76, 34, 54, 29, 66, 99};	// 배열 생성
		RandomAccessFile rac = new RandomAccessFile("temp.txt", "rw");
		rac.write(data);	// 데이터를 읽는다.
		System.out.println("파일 출력 : temp.txt");
		System.out.println("-----------------");
		
		for(int i=0; i<data.length; i++) {
			int accepoint = (int)((Math.random() * 100) % 10); 	// 0 ~ 9 정수
			rac.seek(accepoint);
			System.out.print("현재 파일 포인터 : " + rac.getFilePointer());	// 파일 포인터가 몇 번인지 알려준다.
			System.out.println(", 데이터 : " + rac.read());
		}
	}
}
