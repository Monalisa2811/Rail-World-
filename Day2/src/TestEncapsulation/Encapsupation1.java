package TestEncapsulation;

public class Encapsupation1 {

	public static void main(String[] args) {
		Account acc1=new Account();
		acc1.setAccountNumber(625317437);
		acc1.setName("Monalisa");
		acc1.setEmail("monalisa@123");
		acc1.setAmount(1234);
		System.out.println(acc1.getAccountNumber()+" "+acc1.getName()+" "+acc1.getEmail()+" "+acc1.getAmount());

	}

}
