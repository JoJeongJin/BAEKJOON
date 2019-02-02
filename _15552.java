import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15552 {
	public static void main(String args[]) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s = bf.readLine();
			int test_num = Integer.parseInt(s);
			
			int a;
			int b;
			for(int i=0; i<test_num; i++) {
				s = bf.readLine();
				StringTokenizer st = new StringTokenizer(s);
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				bw.write((a+b)+"\n");
			}
			
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
