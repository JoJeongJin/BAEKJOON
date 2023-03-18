import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17427 {
    public static void main(String[] args) throws Exception {
        new _17427().solve();
    }

    /**
     * 아래 부분에 코드 작성
     */
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(br.readLine());
        long result = 0;
        for(int i=1; i<=input; i++){
            result += (input/i) * i;
        }

        System.out.println(result);
    }
}
