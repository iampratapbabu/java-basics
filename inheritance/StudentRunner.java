package project1.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Hello pratap");
		student1.setName("Tej pratap");
		System.out.println(student1.getName());
		
		Person person = new Person("babuuus");
		//person.setName("Ranga");
		person.setEmail("ranga@gmail.com");
		person.setPhoneNumber("3290230320");
		
		String value = person.toString();  //value me person object to copy kr liye
		
		System.out.println(value);
		System.out.println(person);

	}

}
