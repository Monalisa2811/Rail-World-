package ExceptionHandling;

public class TestThrow2 {
	public static int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    } 

	public static void main(String[] args) {
		TestThrow2 obj = new TestThrow2();  
        try {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e){  
            System.out.println("\nNumber cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code..");  
	}

}
