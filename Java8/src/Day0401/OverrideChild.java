package Day0401;

public class OverrideChild extends OverrideParent {
	void method3() {
		System.out.println("자식 메서드3");
	}
	
	@Override	//재정의 한다는 것을 알려주는 주석
	void method2() {
		System.out.println("자식 메서드2");
	}
}
