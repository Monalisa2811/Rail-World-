package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		Scanner scn= new Scanner(System.in);
		int b=scn.nextInt();
		for(int i=0;i<a.length;i++) {
			
			if(b==a[i])
				System.out.println("Linear element : "+ a[i]);
		}

	}

}
