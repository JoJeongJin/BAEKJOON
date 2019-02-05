import java.util.*;

public class _1475 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int set_num = 0;
		int[] arr = new int[10];
		int max = 1;
		String input = scan.next();
		
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i)-48]++;
		}
		
		for(int i=0; i<10; i++) {
			if(i!=6&&i!=9) {
				if(max<arr[i]) {
					max = arr[i];
				}
			}
		}
		double _compare = Math.ceil(((arr[6]+arr[9])/2.0));
		if( _compare>max ) {
			max = (int)_compare;
		}
		
		System.out.print(max);
	}
}