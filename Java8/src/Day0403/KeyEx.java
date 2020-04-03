package Day0403;

public class KeyEx {
	public static void main(String[] args) {
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		System.out.println(k1.toString());	//toString을 지우고 (k1)만 입력해도 자동으로 똑같이 실행된다.
		
	}
}
