import java.util.Scanner;

public class _2579 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int[] stairs = new int[input];
		
		for(int i=0; i<input; i++) {
			stairs[i] = scan.nextInt();
		}
		
		int[][] try_stair = new int[2][input];
		
		try_stair[0][0] = stairs[0];
		try_stair[0][1] = stairs[1];
		try_stair[1][1] = stairs[0]+stairs[1];
		
		for(int i=2; i<input; i++) {
			int big = 0;
			if(try_stair[1][i-2]>try_stair[0][i-2]) {
				big = try_stair[1][i-2];
			}else {
				big = try_stair[0][i-2];
			}
			try_stair[0][i] = big + stairs[i];
			try_stair[1][i] = try_stair[0][i-1] + stairs[i];
		}
		
		if(try_stair[0][input-1] > try_stair[1][input-1]) {
			System.out.println(try_stair[0][input-1]);
		}else {
			System.out.println(try_stair[1][input-1]);
		}
	}
}