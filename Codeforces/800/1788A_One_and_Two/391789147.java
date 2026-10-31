// Codeforces: https://codeforces.com/contest/1788/A
// Problem: One and Two
// Submission: https://codeforces.com/contest/1788/submission/391789147
// Language: Java 21
// Submitted: 2026-09-23T14:43:18.000Z
// Rating: 800
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                int totalTwos = 0;

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                    if (a[i] == 2) {
                        totalTwos++;
                    }
                }

                if (totalTwos % 2 != 0) {
                    System.out.println(-1);
                } else {
                    int target = totalTwos / 2;
                    int currentTwos = 0;
                    int ans = -1;

                    for (int i = 0; i < n - 1; i++) {
                        if (a[i] == 2) {
                            currentTwos++;
                        }
                        if (currentTwos == target) {
                            ans = i + 1;
                            break;
                        }
                    }

                    System.out.println(ans);
                }
            }
        }
        sc.close();
    }
}
