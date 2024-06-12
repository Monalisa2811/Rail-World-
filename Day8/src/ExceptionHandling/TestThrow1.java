package ExceptionHandling;

public class TestThrow1 {
	public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  

	public static void main(String[] args) {
		TestThrow1 obj = new TestThrow1();  
        obj.checkNum(-3);  
        System.out.println("Rest of the code..");  
	}

}
