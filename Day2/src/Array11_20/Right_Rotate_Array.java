package Array11_20;

public class Right_Rotate_Array {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5,6,7};
		int n=3;
		System.out.print("Array elements before Right_Rotate : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		for(int i=0;i<3;i++) {
			
			int j,last=array[array.length-1];
			for(j = array.length-1; j > 0; j--){  
                array[j] = array[j-1];  
            }  
            array[0] = last; 
		}
		
		
		 System.out.println();  
	        System.out.print("Array after right rotation: ");  
	        for(int i = 0; i< array.length; i++){  
	            System.out.print(array[i] + " ");  
	        }

	}

}
