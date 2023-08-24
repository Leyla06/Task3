package taskThirdLesson;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.name = "Shamil";
		instructor.surname = "Abilov";
		Student student = new Student();
		student.name = "Leyla";
		student.surname = "Xelilova";
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
	}
}
