import java.util.Scanner;

public class _2740 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(), M = scan.nextInt(),K;
		
		int ar1[][] = new int[N][M];
		for(int a=0; a<N; a++) {
			for(int b=0; b<M; b++) {
				ar1[a][b] = scan.nextInt();
			}
		}
		
		M=scan.nextInt(); K=scan.nextInt();
		int ar2[][] = new int[M][K];
		
		for(int a=0; a<M; a++) {
			for(int b=0; b<K; b++) {
				ar2[a][b] = scan.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {

			for(int k=0; k<K; k++) {
				int sum=0;
				for(int j=0; j<M; j++) {
					sum+=ar1[i][j] * ar2[j][k];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}