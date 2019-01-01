import java.util.*;

public class _1912 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int gaesu = scan.nextInt();
		int now_input = scan.nextInt();
		int now_sum = now_input;
		int max = now_sum;
		
		for(int i=1; i<gaesu; i++) {
			now_input = scan.nextInt();
			if(now_sum<0) {
				now_sum = now_input;
			}else {
				now_sum+=now_input;
			}
			
			if(now_sum>max) {
				max=now_sum;
			}
		}
		
		System.out.println(max);
	}
}
