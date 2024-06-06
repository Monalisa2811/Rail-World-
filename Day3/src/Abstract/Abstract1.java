package Abstract;

abstract class Bike{
	abstract void run();
}

public class Abstract1 extends Bike {
	
	void run() {
		System.out.println("It can run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Abstract1();
		b1.run();

	}

}
