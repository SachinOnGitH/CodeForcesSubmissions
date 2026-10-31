// Codeforces: https://codeforces.com/contest/2275/A
// Problem: In Search of Convenience
// Submission: https://codeforces.com/contest/2275/submission/393522987
// Language: Java 21
// Submitted: 2026-10-07T14:49:52.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x0 = Integer.parseInt(st.nextToken());
            int y0 = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            sb.append(x0).append(" ").append(y0 + r).append("\n");
        }
        
        System.out.print(sb);
    }
}
