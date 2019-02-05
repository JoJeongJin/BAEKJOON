import java.util.*;

public class _1436 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dooms_num = "";
		int input_num = scan.nextInt();
		int start = 0;
		while(input_num>0) {
			start++;
			String _try = String.valueOf(start);
			if(_try.contains("666")) {
				input_num--;
				dooms_num = _try;
			}
		}
		
		System.out.print(dooms_num);
	}
}