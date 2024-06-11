package Array;

public class ReturningArrayFromMethod {
	
	public static int[] get() {
		return new int[] {56,78,9,3,7};
	}

	public static void main(String[] args) {
		int[] arr=get();
		System.out.print("Array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
