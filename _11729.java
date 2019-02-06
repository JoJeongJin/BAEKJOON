import java.util.Scanner;

public class _11729 {
	public static int sum = 0;
	public static StringBuilder sb = new StringBuilder();
	
	
	public static String output = "";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input_num = scan.nextInt();
		
		hanoi(input_num,1,2,3);
		
		sb.insert(0, sum+"\n");
		System.out.println(sb);
		
		
	}
	static void hanoi(int input, int from, int by, int to) {
		sum++;
		if(input==1) {
			Move(from,to);
		}
		else {
		hanoi(input-1,from,to,by);
		Move(from,to);
		hanoi(input-1,by,from,to);
		}
	}
	
	static void Move(int a, int b) {
		sb.append(a+" "+b+"\n");
	}
	
}
