package ExceptionHandling;

public class TryFinallyBlock3 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			 int data=25/0;    
		     System.out.println(data); 
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("It always execute");
		}
		System.out.println("Rest of code");

	}

}
