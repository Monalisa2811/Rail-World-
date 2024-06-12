package ExceptionHandling;

public class TryFinallyVlock2 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			 int data=25/0;    
		     System.out.println(data); 
		}
		catch(NullPointerException np) {
			System.out.println(np);
		}
		finally {
			System.out.println("It always execute");
		}
		System.out.println("Rest of code");
	}

}
