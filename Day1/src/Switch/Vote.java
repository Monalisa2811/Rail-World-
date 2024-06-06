package Switch;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Age : ");
		int age=scn.nextInt();
		int result;
		if(age>=18) result=1;
		else result=2;
		switch(result) {
		case 1:
			System.out.println("Eligible for vote");
			break;
		case 2:
			System.out.println("Not eligible for vote");
			break;
		
		
		}
		
		
		

	}

}
