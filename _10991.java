import java.util.*;

public class _10991 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input =scan.nextInt();
		
		for(int i=input; i>=1; i--) {
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(input-i)*2; j++) {
				if(j%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}