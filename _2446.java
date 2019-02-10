import java.util.Scanner;

public class _2446 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			if (i+1 < input) {
				for (int j = 1; j < input * 2 - (i * 2); j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < Math.abs(input-i); j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}
		
		for (int i = 0; i < input-1; i++) {
			for (int j = input-2; j > i; j--) {
				System.out.print(" ");
			}

			for(int j=0; j< (i+1)*2+1; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}
}