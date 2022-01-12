import java.util.Scanner;

public class _1748 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int length = 1;
        int answer = 0;
        int temp = 10;

        for(int i=1; i<=input; i++){
            if(temp == i){
                length++;
                temp*=10;
            }
            answer+=length;
        }
        System.out.println(answer);
    }


}
