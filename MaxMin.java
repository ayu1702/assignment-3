package assign;

public class arr {

	public static void main(String[] args) {
		

		
				
				int arr[]= {7,8,9,2,1,4,3};
				int max=arr[0];
				int min=arr[0];
		        for(int i=0;i<arr.length;i++) {
		        	
		        	if(arr[i]>max) {
		        		max=arr[i];
		        	}
		        	else if(arr[i]<min) {
		        		min=arr[i];
		        	}
		        	
		        }
				System.out.println("max = "+max);
				System.out.println("min = "+min);

			}

		
	}
