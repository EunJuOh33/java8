package Day0408;

public class Member2 {
	private String name;
	private String id;
	
	public Member2() {
		System.out.println("Member() ����");
	}
	public Member2(String id) {
		System.out.println("Member(String id) ����");
		this.id = id;
	}
	public Member2(String name, String id) {
		System.out.println("Member(String name, String id)");
	}
	
	public String getId() { return id; }
}
