package ExceptionHandling;

public class TryCatch1 {

	public static void main(String[] args) {
		try {
			int a=10/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("Cann't divide a number by zero");
		}
		
	}

}
