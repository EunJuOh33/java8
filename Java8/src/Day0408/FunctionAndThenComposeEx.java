package Day0408;

import java.util.function.Function;

public class FunctionAndThenComposeEx {
	public static void main(String[] args) {
		//compose�� andThen ��
		
		Function<Member, Adress> functionA;
		Function<Adress, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAdress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Adress("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Adress("�ѱ�", "����")));
		System.out.println("���� ����: " + city);
	}
}
