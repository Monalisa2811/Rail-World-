package Array11_20;

public class Sum_Of_Elements_Of_Array {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of elements of array : "+sum);

	}

}
