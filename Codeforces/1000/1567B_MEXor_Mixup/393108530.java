// Codeforces: https://codeforces.com/contest/1567/B
// Problem: MEXor Mixup
// Submission: https://codeforces.com/contest/1567/submission/393108530
// Language: Java 21
// Submitted: 2026-10-03T18:37:19.000Z
// Rating: 1000
import java.util.Scanner;

public class Main {
    // O(1) Prefix XOR sum from 0 to k
    private static int getPrefixXOR(int k) {
        if (k < 0) return 0;
        int rem = k % 4;
        if (rem == 0) return k;
        if (rem == 1) return 1;
        if (rem == 2) return k + 1;
        return 0;
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int currentXOR = getPrefixXOR(a - 1);

        if (currentXOR == b) {
            System.out.println(a);
        } else if ((currentXOR ^ b) != a) {
            System.out.println(a + 1);
        } else {
            System.out.println(a + 2);
        }
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
