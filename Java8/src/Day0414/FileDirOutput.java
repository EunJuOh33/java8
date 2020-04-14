package Day0414;

import java.io.File;

public class FileDirOutput {
	static String dir;
	
	public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("main() 매개변수를 입력하세요.");
//			System.exit(1);
//		}
		
//		dir = args[0];
		dir = "c:/java";	// 경로는 /로 구분(리눅스), \로 구분(윈도우)
							// 윈도우도 /로 구분 가능하다.
							// 윈도우에서 \는 특수문자 입력이므로 \\처럼 두 개를 입력해야 하나로 인식한다.
		File myFile = new File(dir);
		String[] flist = myFile.list();
		System.out.println("검색 디렉토리 : " + dir);
		System.out.println("------------------");
		for(int i=0; i<flist.length; i++) {
			File cfile = new File(dir + "/" + flist[i]);	// 파일 생성
			if(cfile.isDirectory()) {
				System.out.println("디렉토리 : " + flist[i]);
			} else {
				System.out.println("파일 : " + flist[i]);
			}
		}
	}
}
