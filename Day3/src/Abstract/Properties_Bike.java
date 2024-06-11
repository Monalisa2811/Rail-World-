package Abstract;

abstract class Bike1{
	abstract void run();
	abstract int gear();
}

class Splender extends Bike1{
	void run() {
		System.out.println("It runs fast");
	}
	
	int gear() {
		return 5;
		
	}
}
public class Properties_Bike {

	public static void main(String[] args) {
		Bike1 bi=new Splender();

	}

}
