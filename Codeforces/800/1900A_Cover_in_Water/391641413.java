// Codeforces: https://codeforces.com/contest/1900/A
// Problem: Cover in Water
// Submission: https://codeforces.com/contest/1900/submission/391641413
// Language: Java 21
// Submitted: 2026-09-22T12:08:26.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            String s = reader.readLine().trim();
            
            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
