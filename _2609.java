import java.util.*;

public class _2609 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int max = Math.max(A, B), min = Math.min(A, B);
		
		while(max%min!=0) {
			int na = max % min;
			max = min;
			min = na;
		}
		
		System.out.println(min);
		System.out.println(A*B/min);
	}
}
