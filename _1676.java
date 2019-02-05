import java.util.*;

public class _1676 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int two = 0, five = 0, input_num = scan.nextInt();
		
		for(int i=1; i<=input_num; i++) {
			int temp = i;
			while(temp%2==0) {
				two++;
				temp=temp/2;
			}
			
			while(temp%5==0) {
				five++;
				temp=temp/5;
			}
		}
		
		System.out.print(Math.min(two, five));
	}
}
