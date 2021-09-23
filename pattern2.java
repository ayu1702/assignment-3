package assign;

public class pattern2 {

	public static void main(String[] args) {
		
		int i,j, row=4;
		for( i=1;i<=row;i++) {
			for( j=2*(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");

			}
			
			System.out.println();

		}

  
	}

}
