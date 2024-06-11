package Array;

public class No_Of_Elements {

	public static void main(String[] args) {
		int[] a= {23,45,6,67,8,9,1,0};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count++;
		}
		System.out.println("Number of elements present in the given array is "+count);
	}

}
