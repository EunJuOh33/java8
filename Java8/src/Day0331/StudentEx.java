package Day0331;

public class StudentEx {
	public static void main(String[] args) {
		Student s1 = new Student("È«±æµ¿", "³²¼º", 30, 20200001);
		Student s2 = new Student();
		s2.setName("±èÀ»µ¿");
		s2.setGender("¿©¼º");
		s2.setAge(40);
		s2.setsNo(20200001);
		s1.showInfo();
		s2.showInfo();	
	}
}
