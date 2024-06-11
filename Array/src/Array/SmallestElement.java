package Array;

public class SmallestElement {

	public static void main(String[] args) {
int[] array=new int[] {1,6,3,8,9,2};
		
		System.out.print("Array elements are : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			if(array[0]>array[i]) {
				array[0]=array[i];
			}
		}
		System.out.println("Smallest elementof the array is : "+array[0]);
	}

}
