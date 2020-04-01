package Day0401;

public class PromoEx {
	public static void main(String[] args) {
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		PromoParent pp = pc;	//자식은 부모에 대입이 가능합니다. (자동형변환)
		pp.method1();
		pp.method2();
//		pp.method3();	//부모의 형태이기 때문에 부모에는 method3가 없습니다. 그래서 사용이 불가능합니다.
		
		
//		pc = pp;	//자식에 부모를 대입할 수 없습니다.
		pc = (PromoChild)pp;	//강제형변환은 가능합니다.
		pc.method1();	//부모의 객체가 자식의 객체에 대입될 때는 원래부터 자식 객체였어야만 합니다.
		pc.method2();
		pc.method3();
		
		PromoParent pp2 = new PromoParent();
		if(pp2 instanceof PromoChild) {	//instanceof는 형변환이 가능한지 boolean값으로 반환합니다.
			pc = (PromoChild)pp;
			pc.method3();
		} else {
			System.out.println("강제형변환을 사용할 수 없습니다.");
		}
		
		pc = (PromoChild)pp2;	//오류발생.강제형변환은 원래의 형태로 복구만 가능합니다.
		pc.method3();
	}
}
