package Abstract;

abstract class Bike{
	abstract void run();
	abstract int gear();
}

class Splender extends Bike{
	void run() {
		System.out.println("It runs fast");
	}
	
	int gear() {
		return 5;
		
	}
}
public class Properties_Bike {

	public static void main(String[] args) {
		Bike bi=new Splender();

	}

}
