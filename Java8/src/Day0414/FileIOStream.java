package Day0414;

import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {
	static String tfile;
	public static void main(String[] args) {
		int cnt;
		char chr;
		
		if(args.length != 1) {
			System.out.println("매개변수로 텍스트파일 이름을 입력하세요.");
			System.exit(1);	// 정상적인 종료가 아니다.
		}
		
		tfile = args[0];
		try {
			FileReader fr = new FileReader(tfile);	//이 위치의 파일을 fr이라고 만든다.
			System.out.println("파일 이름 : " + tfile);
			System.out.println("------------------");
			while((cnt = fr.read()) != -1) {
				chr = (char)cnt;
				System.out.print(chr);
			}
		} catch(IOException e) {
			System.out.println(e.toString());
//		} finally {	//옛날 코드
//			try {
//				if (fr != null)
//					fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
		}
	}
}
