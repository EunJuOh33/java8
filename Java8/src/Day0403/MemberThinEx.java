package Day0403;

public class MemberThinEx {
	public static void main(String[] args) {
		//원본 객체 생성
		MemberThin original = new MemberThin("blue", "홍길동", "12345", 25, true);
		
		//복제 객체를 얻은 후에 패스워드 변경
//		MemberThin cloned = original.getMember();	//복제한 패스워드만 변경한다.
		MemberThin cloned = original;	//원본의 패스워드까지 변경한다.
		
		cloned.password = "67890";	//복제 객체에서 패스워드 변경
		
		System.out.println(original.hashCode() + " : " + cloned.hashCode());
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adeult: " + cloned.adult);
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}
}
