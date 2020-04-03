package Day0403;

import java.util.Arrays;

public class WhildCardEx {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: "
		+ Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Person person = new Person("일반인");
		Worker worker = new Worker("직장인");
		Student student = new Student("학생");
		HighStudent highStudent = new HighStudent("고등학생");
		
		Course<Person> personCourse = new Course<>("일반인 코스", 5);
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(student);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);	//학생을 최상위로 해야되기 때문에 학생은 입력되지 않는다.
		registerCourseWorker(personCourse);
		
		Course<Student> studentCourse = new Course<Student>("학생코스", 5);
//		studentCourse.add(person);
//		studentCourse.add(worker);
		studentCourse.add(student);
		studentCourse.add(highStudent);
		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);	//studentCourse는  Student로 만들어졌기 때문에 안된다.
		System.out.println();
		
		Course<Worker> workerCourse = new Course<Worker>("직장인코스", 5);
//		workerCourse.add(person);
		workerCourse.add(worker);
//		workerCourse.add(student);
//		workerCourse.add(highStudent);
		
		registerCourse(workerCourse);
//		registerCourseStudent(workerCourse);
		registerCourseWorker(workerCourse);
	}
}
