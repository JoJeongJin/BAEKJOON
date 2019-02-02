import java.util.Scanner;

public class _11365 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input;
		
		while(true) {
			input = scan.nextLine();
			if(input.equals("END")) {
				break;
			}
			
			for(int i=input.length()-1; i>=0; i--) {
				System.out.print(input.charAt(i));
			}
			System.out.println();
		}
	}
}