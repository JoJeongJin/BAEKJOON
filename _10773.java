import java.util.*;

public class _10773 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int input_num = scan.nextInt();
		int sum = 0;
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < input_num; i++) {
			int temp = scan.nextInt();
			if (temp != 0) {
				st.push(temp);
			} else {
				st.pop();
			}
		}

		while (!st.isEmpty()) {
			sum+=st.pop();
		}
		
		System.out.println(sum);
	}
}