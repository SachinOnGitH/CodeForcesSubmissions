// Codeforces: https://codeforces.com/contest/2065/A
// Problem: Skibidus and Amog'u
// Submission: https://codeforces.com/contest/2065/submission/385158210
// Language: Java 21
// Submitted: 2026-08-01T15:39:52.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            
            String plural = s.substring(0, s.length() - 2) + "i";
            
            sb.append(plural).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
