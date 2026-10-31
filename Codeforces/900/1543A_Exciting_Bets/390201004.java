// Codeforces: https://codeforces.com/contest/1543/A
// Problem: Exciting Bets
// Submission: https://codeforces.com/contest/1543/submission/390201004
// Language: Java 21
// Submitted: 2026-09-10T11:41:46.000Z
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
            
            if (a == b) {
                sb.append("0 0\n");
            } else {
                long diff = Math.abs(a - b);
                long rem = a % diff;
                long moves = Math.min(rem, diff - rem);
                sb.append(diff).append(" ").append(moves).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
