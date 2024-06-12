package ExceptionHandling;

public class MultipleCatch3 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException ae) {
			System.out.println("Cann't divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBoundException occur");
		}
		catch(Exception e) {
			System.out.println("Parent Exception");
		}
		System.out.println("Rest of code");
	}

}
