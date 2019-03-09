import java.util.Scanner;

public class _2167 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(), M = scan.nextInt();
		int[][] array = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		int how_many = scan.nextInt();
		
		for(int i=0; i<how_many; i++) {
			int first = scan.nextInt()-1, second = scan.nextInt()-1, third = scan.nextInt()-1, fourth = scan.nextInt()-1;
			
			int sum = 0;
			
			for(int k=first; k<=third; k++) {
				for(int j=second; j<=fourth; j++) {
					sum+=array[k][j];
				}
			}
			
			System.out.println(sum);
		}
	}
}