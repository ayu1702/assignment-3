package assign;
import java.util.Scanner;

import java.util.Scanner;

public class NumNotPresent {

	public static void main(String[] args) {
		
		int i;
		int n;
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");
		
		n=sc.nextInt();  

		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(i=0; i<n; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}
		
		int max=array[0];
		for(i=0;i<array.length;i++) {
			if(array[i]>max) {
	    		max=array[i];
	    	}
		}
		System.out.println("max : "+max);  
		
		
		System.out.println("all natural numbers are : ");  
		for(int j=0;j<=max;j++) {
            System.out.println(j);  
		}
		
		System.out.println("numbers not present in an array : ");  

		for(i=0;i<array.length;i++) {
        	int num= array[i];
//			System.out.println(num);  
            for(int j=0;j<=max;j++) {
            	if(num!=j) {
    			int numNotPresent=j;
            	System.out.println("numNotPresent = " +numNotPresent);
            	
            }
            	
          }
		}
//            for(int j=0;j<=max;j++) {
//    			if(num==array[j]) {
//    				System.out.println(array[j]);  
//
//    			};  
//
//            }
////			System.out.println(num);  
//
////            	if(array[j]!=num) {
////			System.out.println("max : "+max);  
////			System.out.println(array[i]);  
//
//
//            }
		
	sc.close();
	
}
}
