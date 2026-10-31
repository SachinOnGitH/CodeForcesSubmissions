// Codeforces: https://codeforces.com/contest/1374/C
// Problem: Move Brackets
// Submission: https://codeforces.com/contest/1374/submission/395728622
// Language: Java 21
// Submitted: 2026-10-23T16:12:26.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            
            int balance = 0;
            int minBalance = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(') {
                    balance++;
                } else {
                    balance--;
                }
                
                if (balance < minBalance) {
                    minBalance = balance;
                }
            }
            
            sb.append(-minBalance).append("\n");
        }
        
        System.out.print(sb);
    }
}
