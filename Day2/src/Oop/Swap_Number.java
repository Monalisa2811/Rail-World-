package Oop;

public class Swap_Number {
	
	public static void swap(int n1,int n2) {
		int t=n1;
		n1=n2;
		n2=t;
		System.out.println(n1+ " " +n2);
	}

	public static void main(String[] args) {
		int n1=1;
		int n2=3;
		swap(n1,n2);
		//System.out.println(n1+ " " +n2);

	}

}
