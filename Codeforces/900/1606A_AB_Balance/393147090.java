// Codeforces: https://codeforces.com/contest/1606/A
// Problem: AB Balance
// Submission: https://codeforces.com/contest/1606/submission/393147090
// Language: Java 21
// Submitted: 2026-10-04T07:53:13.000Z
// Rating: 900
import java.util.Scanner;

public class Main {
    public static void solve(Scanner sc) {
        String s = sc.next();
        char[] arr = s.toCharArray();
        int n = arr.length;

        if (arr[0] != arr[n - 1]) {
            arr[0] = arr[n - 1];
        }

        System.out.println(new String(arr));
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
