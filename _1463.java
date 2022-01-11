import java.util.Scanner;

public class _1463{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[1000001];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 1;

        for(int i=4;i<=N;i++)
        {
            int firstCheck = Integer.MAX_VALUE;
            int secondCheck = Integer.MAX_VALUE;
            int thirdCheck = arr[i-1];

            if(i % 3 == 0){
                firstCheck = arr[i/3];
            }
            if(i % 2 == 0){
                secondCheck = arr[i/2];
            }

            arr[i] = Math.min(firstCheck, Math.min(secondCheck, thirdCheck)) + 1;
        }
        System.out.print(arr[N]);
    }
}