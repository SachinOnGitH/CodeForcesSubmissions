// Codeforces: https://codeforces.com/contest/1679/A
// Problem: AvtoBus
// Submission: https://codeforces.com/contest/1679/submission/396313480
// Language: Java 21
// Submitted: 2026-10-27T15:44:03.000Z
// Rating: 900
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
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            long n = Long.parseLong(st.nextToken());
            
            if (n % 2 != 0 || n < 4) {
                sb.append("-1\n");
            } else {
                long minVehicles = (n + 5) / 6;
                long maxVehicles = n / 4;
                sb.append(minVehicles).append(" ").append(maxVehicles).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
