package Array;

public class Even_Element_Of_Array {

	public static void main(String[] args) {
		int[] array=new int[] {1,4,5,6,8};
		int i;
		System.out.print("Array elements are:");
		for( i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Even index elements are:");
		for(i=0;i<array.length;i++) {
			if(i%2!=0) {
				System.out.print(array[i]+" ");
			}
		}

	}

}
