package Day0403;

import java.util.Arrays;

public class WhildCardEx {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Person person = new Person("�Ϲ���");
		Worker worker = new Worker("������");
		Student student = new Student("�л�");
		HighStudent highStudent = new HighStudent("�����л�");
		
		Course<Person> personCourse = new Course<>("�Ϲ��� �ڽ�", 5);
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(student);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);	//�л��� �ֻ����� �ؾߵǱ� ������ �л��� �Էµ��� �ʴ´�.
		registerCourseWorker(personCourse);
		
		Course<Student> studentCourse = new Course<Student>("�л��ڽ�", 5);
//		studentCourse.add(person);
//		studentCourse.add(worker);
		studentCourse.add(student);
		studentCourse.add(highStudent);
		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);	//studentCourse��  Student�� ��������� ������ �ȵȴ�.
		System.out.println();
		
		Course<Worker> workerCourse = new Course<Worker>("�������ڽ�", 5);
//		workerCourse.add(person);
		workerCourse.add(worker);
//		workerCourse.add(student);
//		workerCourse.add(highStudent);
		
		registerCourse(workerCourse);
//		registerCourseStudent(workerCourse);
		registerCourseWorker(workerCourse);
	}
}