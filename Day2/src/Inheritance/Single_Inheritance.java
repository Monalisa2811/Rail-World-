package Inheritance;
class Person{
	void eat() {
		System.out.println("	Eating");
	}
	void sleep() {
		System.out.println("	Sleeping");
	}
}

class Student extends Person{
	void study() {
		System.out.println("	Studying");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		Student s1= new Student();
		System.out.println("A student can:");
		s1.eat();
		s1.sleep();
		s1.study();

	}

}
