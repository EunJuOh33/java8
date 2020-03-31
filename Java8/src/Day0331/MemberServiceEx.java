package Day0331;

public class MemberServiceEx {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Member hong = new Member("홍길동", "hong");
		hong.password = "12345";
		hong.age = 30;
		
		if(ms.login(hong.id, hong.password)) {
			System.out.println("로그인하였습니다.");
			ms.logout(hong.id);
		} else {
			System.out.println("정보를 잘못입력하셨습니다.");
		}
		
		Member lee = new Member("이연희", "lee");
		hong.password = "12345";
		hong.age = 20;
		if(ms.login(lee.id, lee.password)) {
			System.out.println("로그인하였습니다.");
			ms.logout(lee.id);
		} else {
			System.out.println("정보를 잘못입력하셨습니다.");
		}
	}
}
