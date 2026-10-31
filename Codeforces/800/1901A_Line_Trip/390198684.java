// Codeforces: https://codeforces.com/contest/1901/A
// Problem: Line Trip
// Submission: https://codeforces.com/contest/1901/submission/390198684
// Language: Java 21
// Submitted: 2026-09-10T11:16:27.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            int ans = 0;
            int prev = 0;
            int curr = 0;
            
            for (int i = 0; i < n; i++) {
                curr = Integer.parseInt(st.nextToken());
                ans = Math.max(ans, curr - prev);
                prev = curr;
            }
            
            ans = Math.max(ans, 2 * (x - curr));
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
