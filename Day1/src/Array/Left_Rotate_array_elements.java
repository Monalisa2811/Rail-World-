package Array;

public class Left_Rotate_array_elements {

	public static void main(String[] args) {
		 int [] arr1 = new int [] {1, 2, 3, 4, 5};  
	        int n = 3;  
	        System.out.println("Original array elements: ");  
	        for (int i = 0; i < arr1.length; i++) {  
	            System.out.print(arr1[i] + " ");  
	        }  
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            first = arr1[0];  
	            for(j = 0; j < arr1.length-1; j++){  
	                arr1[j] = arr1[j+1];  
	            }  
	            arr1[j] = first;  
	        }  
	        System.out.println();  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr1.length; i++){  
	            System.out.print(arr1[i] + " ");  
	        }  	}

}
