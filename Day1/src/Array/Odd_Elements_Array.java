package Array;

public class Odd_Elements_Array {

	public static void main(String[] args) {
		int[] array=new int[] {1,4,5,6,8};
		int i;
		System.out.print("Array elements are:");
		for( i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Odd index elements are:");
		for(i=0;i<array.length;i++) {
			if(i%2==0) {
				System.out.print(array[i]+" ");
			}
		}
	}

}
