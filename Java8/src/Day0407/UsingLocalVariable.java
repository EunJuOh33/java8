package Day0407;

public class UsingLocalVariable {
		void method(int arg) {	//arg는 final 특성을 가짐
				int localVar = 40;	//localVar는 final 특성을 가짐
				
				//arg = 31;			//final 특성 때문에 수정 불가
				//localVar = 41;	//final 특성 때문에 수정 불가
				
				//람다식
				MyFunctionalInterface fi = () -> {
					//로컬 변수 사용
					System.out.println("arg: " + arg);	//10
					System.out.println("localVar: " + localVar + "\n");	//40
				};
				fi.method();
		}
		
		//값을 바꿀 수 있다.
		void method2(int x) {
			System.out.println(x);
			x = 50;
			System.out.println(x);
		}
}
