import java.util.Scanner;

public class _2941 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		int a = input.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "+").length();
		System.out.println(a);
	}
}