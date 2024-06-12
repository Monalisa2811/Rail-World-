package ExceptionHandling;

public class MultipleBlockCatch2 {

	public static void main(String[] args) {
		try {
			int[] a= new int[5];
			System.out.println(a[10]);
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
