//Find the third largest element in an array
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Third_Largest_Element {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter number of array element:");
		int n= scn.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Thirt largest element :"+a[2]);
		

	}

}
