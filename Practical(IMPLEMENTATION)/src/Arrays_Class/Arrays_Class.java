package Arrays_Class;

import java.util.Arrays;

public class Arrays_Class {
	
public static void main(String[] args) {
	

/* basically this class is taking care of our 
normal primitive type array in this class 
we have some method which we use over our normal arrays
like indexOf , binarySearch , sort and so on 

*/
	
int[] arr = {1,2,3,4,5,6,7};

System.out.println(Arrays.binarySearch(arr, 4));

int[] arr1 = {200,23,5,2,7,3,90,34,23,5,6,2};

Arrays.sort(arr1);

for(int i : arr1) {
	System.out.print(i+" ");
}

System.out.println();
Arrays.fill(arr1, 40);
	
for(int i : arr1) {
	System.out.print(i+" ");
}
	
System.out.println();	
	
}	
	
	
	

}
