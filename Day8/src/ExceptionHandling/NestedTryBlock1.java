package ExceptionHandling;

public class NestedTryBlock1 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Going to divid by zero");
				int a=10/0;
			}
			catch(ArithmeticException ae) {
				System.out.println(ae);
			}
			try {
				int[] a=new int[5];
				a[5]=7;
			}
			catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println(ai);
			}
			System.out.println("Other statements");
		}
		catch(Exception e) {
			System.out.println("handled the exception (outer catch)");
		}
		System.out.println("Normal flow");
	}

}
