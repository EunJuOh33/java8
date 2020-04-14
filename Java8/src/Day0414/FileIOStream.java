package Day0414;

import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {
	static String tfile;
	public static void main(String[] args) {
		int cnt;
		char chr;
		
		if(args.length != 1) {
			System.out.println("�Ű������� �ؽ�Ʈ���� �̸��� �Է��ϼ���.");
			System.exit(1);	// �������� ���ᰡ �ƴϴ�.
		}
		
		tfile = args[0];
		try {
			FileReader fr = new FileReader(tfile);	//�� ��ġ�� ������ fr�̶�� �����.
			System.out.println("���� �̸� : " + tfile);
			System.out.println("------------------");
			while((cnt = fr.read()) != -1) {
				chr = (char)cnt;
				System.out.print(chr);
			}
		} catch(IOException e) {
			System.out.println(e.toString());
//		} finally {	//���� �ڵ�
//			try {
//				if (fr != null)
//					fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
		}
	}
}
