package ExceptionHandling;

public class TryMultipleCatch1 {

	public static void main(String[] args) {
		try {
			int[] a=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("Cann't divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBoundException occur");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}

}
