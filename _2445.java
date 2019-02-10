import java.util.*;

public class _2445 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		for(int i=1; i<=input-1; i++) {
			for(int j=1; j<=input; j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=input-1; j>=0; j--) {
				if(i>j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		for(int i=0; i<input * 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=input-1; i++) {
			for(int j=input-1; j>=0; j--) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=1; j<=input; j++) {
				if(i<j) {
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