import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class _13913 {
    static boolean[] visited = new boolean[200001];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int subinLocation = scan.nextInt();
        int sisterLocation = scan.nextInt();

        Queue<info> queue = new LinkedList<>();
        info first = new info(subinLocation,String.valueOf(subinLocation));
        queue.add(first);

        info answer = new info(0,"");

        if(subinLocation == sisterLocation){
            System.out.println(0);
            System.out.println(subinLocation);
        }else if(subinLocation < sisterLocation){
            while(!queue.isEmpty()){
                info temp = queue.poll();
                visited[temp.getInteger()] = true;
                if(temp.getInteger() == sisterLocation){
                    answer = temp;
                    break;
                }else{
                    int tempMinusOne = temp.getInteger()-1;
                    int tempPlusOne = temp.getInteger()+1;
                    int tempMultipleTwo = temp.getInteger()*2;

                    if(tempMultipleTwo<=200000&&!visited[tempMultipleTwo])
                    queue.add(new info(tempMultipleTwo, temp.getString()+" "+tempMultipleTwo));
                    if(tempMinusOne >= 0 && !visited[tempMinusOne]){
                        queue.add(new info(tempMinusOne, temp.getString()+" "+tempMinusOne));
                    }
                    if(tempPlusOne<=200000&&!visited[tempPlusOne])
                    queue.add(new info(tempPlusOne, temp.getString()+" "+tempPlusOne));

                }
            }
            int answerTry = 0;
            for(int i=0; i<answer.getString().length(); i++){
                if(answer.getString().charAt(i) ==' '){
                    answerTry++;
                }
            }
            System.out.println(answerTry);
            System.out.println(answer.getString());
        }else if(subinLocation > sisterLocation){
            int tryNum = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=subinLocation; i>=sisterLocation; i--){
                al.add(i);
                tryNum++;
            }

            System.out.println(tryNum-1);
            for(Integer integer : al){
                System.out.print(integer+" ");
            }

        }
    }

    public static class info{
        Integer integer;
        String string;
        public info(Integer integer, String string){
            this.integer = integer;
            this.string = string;
        }

        public int getInteger(){
            return integer;
        }
        public String getString(){
            return string;
        }
    }
}
