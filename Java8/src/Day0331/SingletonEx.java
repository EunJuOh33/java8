package Day0331;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1;
//		s1 = new Singleton();	//생성자 호출은 불가능합니다.
		s1 = Singleton.getInstance(); //기존에 생성된 객체를 호출합니다.
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");	//동일 객체
		}
		
		
		Member m1 = new Member("홍길동", "hong");	//아까 만들었던 Member 클래스를 사용
		Member m2 = new Member("홍길동", "hong");	
		if(m1 == m2) {
			System.out.println("동일 객체");
		} else {
			System.out.println("다른 객체");	//다른 객체
		}
	}	
}
