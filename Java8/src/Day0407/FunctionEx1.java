package Day0407;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {
	public static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
	
	public static void printString(Function<Student, String> function) {
			for(Student student : list) {
				System.out.print(function.apply(student) + " ");
			}
			System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
			for(Student student : list) {
				System.out.print(function.applyAsInt(student) + " ");
			}
			System.out.println();
	}
	
	public static void main(String[] args) {
			System.out.println("[학생 이름]");		//홍길동 신용권
			printString( t -> t.getName() );
			
			System.out.println("[영어 점수]");		//90 95
			printInt( t -> t.getEnglishScore() );
			
			System.out.println("[수학 점수]");		//96 93
			printInt( t -> t.getMathScore() );
	}
}
