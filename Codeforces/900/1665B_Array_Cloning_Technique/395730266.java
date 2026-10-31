// Codeforces: https://codeforces.com/contest/1665/B
// Problem: Array Cloning Technique
// Submission: https://codeforces.com/contest/1665/submission/395730266
// Language: Java 21
// Submitted: 2026-10-23T16:24:19.000Z
// Rating: 900
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            HashMap<Integer, Integer> freq = new HashMap<>();
            int max_freq = 0;

            line = br.readLine();
            while (line == null || line.trim().isEmpty()) {
                line = br.readLine();
            }
            st = new StringTokenizer(line);
            
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int val = Integer.parseInt(st.nextToken());
                int count = freq.getOrDefault(val, 0) + 1;
                freq.put(val, count);
                if (count > max_freq) {
                    max_freq = count;
                }
            }

            if (max_freq == n) {
                out.println(0);
                continue;
            }

            long operations = 0;
            long current = max_freq;

            while (current < n) {
                long add = Math.min(current, (long) n - current);
                operations += 1 + add;
                current += add;
            }

            out.println(operations);
        }
        out.flush();
    }
}
