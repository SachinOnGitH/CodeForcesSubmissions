// Codeforces: https://codeforces.com/contest/1883/B
// Problem: Chemistry
// Submission: https://codeforces.com/contest/1883/submission/391647769
// Language: Java 21
// Submitted: 2026-09-22T12:28:04.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                String s = sc.next();
                
                int[] freq = new int[26];
                for (int i = 0; i < n; i++) {
                    freq[s.charAt(i) - 'a']++;
                }
                
                int oddCount = 0;
                for (int count : freq) {
                    if (count % 2 != 0) {
                        oddCount++;
                    }
                }
                
                if (oddCount <= k + 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
