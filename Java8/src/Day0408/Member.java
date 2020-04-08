package Day0408;

public class Member {
		private String name;
		private String id;
		private Adress adress;
		
		public Member(String name, String id, Adress adress) {
			this.name = name;
			this.id = id;
			this.adress = adress;
		}
		
		public String getName() { return name; }
		public String getId() {return id; }
		public Adress getAdress() { return adress; }
}
