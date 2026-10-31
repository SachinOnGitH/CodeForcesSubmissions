// Codeforces: https://codeforces.com/contest/1913/B
// Problem: Swap and Delete
// Submission: https://codeforces.com/contest/1913/submission/395798962
// Language: Java 21
// Submitted: 2026-10-24T06:47:48.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            String s = reader.readLine().trim();
            int count0 = 0;
            int count1 = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    if (count0 > 0) {
                        count0--;
                    } else {
                        break;
                    }
                } else {
                    if (count1 > 0) {
                        count1--;
                    } else {
                        break;
                    }
                }
                i++;
            }
            
            out.append(s.length() - i).append("\n");
        }
        System.out.print(out);
    }
}
