// Codeforces: https://codeforces.com/contest/1676/A
// Problem: Lucky?
// Submission: https://codeforces.com/contest/1676/submission/384742359
// Language: Java 21
// Submitted: 2026-07-29T10:34:36.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            

            int sum1 = (s.charAt(0) - '0') + (s.charAt(1) - '0') + (s.charAt(2) - '0');
            int sum2 = (s.charAt(3) - '0') + (s.charAt(4) - '0') + (s.charAt(5) - '0');
            

            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
