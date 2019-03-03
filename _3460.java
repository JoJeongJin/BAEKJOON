import java.util.*;

public class _3460 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int T = Scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int Test_num = Scan.nextInt();
			
			for(int j=0; j<21; j++) {
				if(((Test_num>>j) & 1) > 0) {
					System.out.print(j+" ");
				}
			}
			
			System.out.println();
		}
	}
}