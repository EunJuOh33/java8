package Day0408;

import java.util.function.Function;

public class FunctionAndThenComposeEx {
	public static void main(String[] args) {
		//compose와 andThen 비교
		
		Function<Member, Adress> functionA;
		Function<Adress, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAdress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Adress("한국", "서울")));
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Adress("한국", "서울")));
		System.out.println("거주 도시: " + city);
	}
}
