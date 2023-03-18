import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17425 {
    public static void main(String[] args) throws Exception {
        new _17425().solve();
    }

    /**
     * 아래 부분에 코드 작성
     */
    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] fx = new long[1000001];
        long[] gx = new long[1000001];
        int testCase = Integer.parseInt(br.readLine());

        //nlogn?
        for (int i = 1; i < 1000001; i++) {
            for (int j = 1; i * j < 1000001; j++) {
                fx[i * j] += i;
            }
        }

        for (int i=1; i<1000001; i++){
            gx[i] = gx[i-1] + fx[i];
        }

        for (int t = 0; t < testCase; t++) {
            int input = Integer.parseInt(br.readLine());
            sb.append(gx[input]+"\n");
        }

        System.out.print(sb);
    }
}
