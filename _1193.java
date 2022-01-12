import java.util.Scanner;

public class _1193 {
    public static void main(String[] args){
        int x = 1;
        int y = 1;

        boolean isYDirection = true;

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i=2; i<=input; i++){
            if(isYDirection && x==1){
                y++;
                isYDirection = false;
                continue;
            }
            if(!isYDirection && y==1){
                x++;
                isYDirection = true;
                continue;
            }

            if(isYDirection){
                y++;
                x--;
            }else{
                x++;
                y--;
            }
        }
        System.out.println(x+"/"+y);
    }
}
