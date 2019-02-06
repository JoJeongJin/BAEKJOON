import java.util.*;

public class _9461 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		long[] ar = new long[101];
		ar[1] = 1L;
		ar[2] = 1L;
		ar[3] = 1L;
		ar[4] = 2L;
		ar[5] = 2L;
		int T = scan.nextInt();
		
		for(int j=0; j<T; j++) {
		
		int _try = scan.nextInt();
		
		for (int i = 6; i <= _try; i++) {
			ar[i] = ar[i-1]+ar[i-5];
		}
		

		System.out.print(ar[_try]);
		}
		
	}
}