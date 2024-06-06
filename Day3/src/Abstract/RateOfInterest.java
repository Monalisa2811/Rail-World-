package Abstract;

abstract class Bank{
	abstract double interestRate();
}

class SBI extends Bank{
	double interestRate() {
		return 7;
		
	}
}

class PNB extends Bank{
	double interestRate() {
		return 9;
	}
}

public class RateOfInterest {

	public static void main(String[] args) {
		Bank sbi=new SBI();
		System.out.println("Rate of interest in SBI is "+ sbi.interestRate()+"%");

		System.out.println();
		
		Bank pnb=new PNB();
		System.out.println("Rate of interest in PNB is "+ pnb.interestRate()+"%");
		
	}

}
