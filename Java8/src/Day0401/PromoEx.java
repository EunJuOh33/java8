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
	}
}
