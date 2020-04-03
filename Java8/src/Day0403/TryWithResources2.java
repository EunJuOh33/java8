package Day0403;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {
	public void getData(String file) {
		Scanner sc = null;
		try(
				Scanner sc = new Scanner(new File(file)); 
				Scanner sc2 = new Scanner(System.in); 
			){											//자동으로 닫혀야 하는 구문은  소괄호를 이용해 매개변수처럼 괄호 안에 넣는다.
														//여러 개의 자동 닫힘 코드를 작성할 수 있다.
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("예외 발생");
			System.err.println();
			e.getMessage();
			System.err.println();
			e.printStackTrace();
		} finally {	//입출력 스트림을 강제로 닫기 위해서 finally 구간을 이용(1.6 버전)
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
