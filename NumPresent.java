 package assign;

public class NumPresent {

	public static void main(String[] args) {
		
		int arr[]= {7,5,87,42,51,5,1};
		
		int num=87;
		boolean flag=false;
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				flag=true;
				index=i;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("num is present at index = "+ index);

		}
		else {
			System.out.println("num is not present");

		}
		
	}

}
