package assign;

public class num {

	public static void main(String[] args) {
		int arr[]= {7,8,9,2,1,4,3,9};
		
        for(int i=0;i<arr.length;i++) {
        	int num= arr[i];
            for(int j=i+1;j<arr.length;j++) {
            	if(arr[j]==num) {
    				System.out.print("Duplicate " +num );
    				System.out.println(" at index " +j );

            }

        	
        	
        	

        	}
        }
	}
}
