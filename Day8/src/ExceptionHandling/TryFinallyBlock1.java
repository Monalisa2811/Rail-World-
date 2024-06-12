package ExceptionHandling;

public class TryFinallyBlock1 {

	public static void main(String[] args) {
		try {
			int a=25/5;
			System.out.println(a);
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
