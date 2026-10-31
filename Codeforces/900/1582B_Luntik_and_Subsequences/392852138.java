// Codeforces: https://codeforces.com/contest/1582/B
// Problem: Luntik and Subsequences
// Submission: https://codeforces.com/contest/1582/submission/392852138
// Language: Java 21
// Submitted: 2026-10-01T15:27:00.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        
        long countOnes = 0;
        long countZeros = 0;
        
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            if (x == 1) {
                countOnes++;
            } else if (x == 0) {
                countZeros++;
            }
        }
        
        // Total subsequences = countOnes * (2 ^ countZeros)
        long ans = countOnes * (1L << countZeros);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }
}
