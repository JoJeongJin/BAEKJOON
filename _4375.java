import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _4375 {
    //1로만 이루어진 n의 배수?
    //
    public static void main(String[] args) throws IOException {
        String input ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((input = br.readLine()) != null) {
            int inputChangeAsInteger = Integer.parseInt(input);

            int start = 1;
            int length = 1;
            while (true) {
                start %= inputChangeAsInteger;
                if (start % inputChangeAsInteger == 0) {
                    System.out.println(length);
                    break;
                }
                start *= 10;
                start += 1;
                length++;
            }
        }
    }
}
