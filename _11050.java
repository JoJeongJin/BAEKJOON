import java.util.*;

public class _11050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(), K=scan.nextInt();
		
		if(K==0) {
			System.out.print(1);
		}else
		System.out.print(facto(N)/(facto(K)*facto(N-K)));
		
	}
	
	public static int facto(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*facto(n-1);
		}
	}
}