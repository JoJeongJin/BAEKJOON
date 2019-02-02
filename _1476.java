import java.util.Scanner;

public class _1476 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int E = scan.nextInt(), S = scan.nextInt(), M = scan.nextInt();
		int day = 0;
		int A=0,B=0,C=0;
		while(true) {
			A++;
			B++;
			C++;
			day++;
			if(A>=16) {
				A=(A%16)+1;
			}
			if(B>=29) {
				B=(B%29)+1;
			}
			if(C>=20) {
				C=(C%20)+1;
			}
			if(A==E&&B==S&&C==M) {
				break;
			}
		}
		
		System.out.println(day);
	}
}