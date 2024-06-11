package Array;

public class MinValue_Array {
	public static void min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
			//System.out.println();
		}
		System.out.println("The minimum value of the given array : "+min);
	}
	public static void main(String[] args) {
		int[] a= {1,98,45,34,62,0};
		min(a);

	}

}
