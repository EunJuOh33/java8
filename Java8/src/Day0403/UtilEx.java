package Day0403;

public class UtilEx {
	public static void main(String[] args) {
		Box2<String> box = Util.<String>boxing("홍길동");
		String name = box.get();	//String이 저장되어 있음
		System.out.println(name);
		
		Box2<Integer> box2 = Util.boxing(100);	//메소드 호출시 제네릭이 유출된다면
												//생략할 수 있다.
		int number = box2.get();
		System.out.println(number);
	}
}
