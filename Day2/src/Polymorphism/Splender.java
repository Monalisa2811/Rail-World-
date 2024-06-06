package Polymorphism;

class Bike{
	void run() {
		System.out.println("It can run");
	}
	static void stop() {
		System.out.println("it stop");
	}
}

public class Splender extends Bike{
	void run() {
		System.out.println("Splender runs fast");
	}
	static void stop() {
		System.out.println("suddenly we can stop");
	}

	public static void main(String[] args) {
		Bike b= new Splender();
		b.run();
		b.stop();
	}

}
