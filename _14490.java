import java.util.*;

public class _14490 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int a = Integer.parseInt(input.split(":")[0]);
		int b = Integer.parseInt(input.split(":")[1]);
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int na = 1;
		
		while(max%min != 0) {
			int temp = max % min;
			max = min;
			min = temp;
		}
		
		System.out.print(a/min + ":"+ b/min);
	}
}