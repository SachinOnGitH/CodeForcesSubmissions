// Codeforces: https://codeforces.com/contest/1624/B
// Problem: Make AP
// Submission: https://codeforces.com/contest/1624/submission/390202525
// Language: Java 21
// Submitted: 2026-09-10T11:58:08.000Z
// Rating: 900
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
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            
            boolean possible = false;
            
            if ((2 * b - c) > 0 && (2 * b - c) % a == 0) {
                possible = true;
            }
            if ((a + c) % (2 * b) == 0) {
                possible = true;
            }
            if ((2 * b - a) > 0 && (2 * b - a) % c == 0) {
                possible = true;
            }
            
            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        
        System.out.print(sb);
    }
}
