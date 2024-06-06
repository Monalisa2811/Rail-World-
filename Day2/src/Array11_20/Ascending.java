package Array11_20;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int[] array=new int[] {8,5,2,9,76};
		//System.out.println(Arrays.sort(array));
		int temp;
		System.out.println("Array elements before ascending : ");
		for(int i=0;i<array.length-1;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Array elements after ascending : ");
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length-1;j++) {
				if(array[i]>array[j+1])
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}

	}

}
