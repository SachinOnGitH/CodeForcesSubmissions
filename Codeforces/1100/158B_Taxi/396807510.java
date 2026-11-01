// Codeforces: https://codeforces.com/contest/158/B
// Problem: Taxi
// Submission: https://codeforces.com/contest/158/submission/396807510
// Language: Java 21
// Submitted: 2026-10-31T14:25:55.000Z
// Rating: 1100

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] count = new int[5];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }

        int ans = count[4];

        ans += count[3];
        count[1] = Math.max(0, count[1] - count[3]);

        ans += count[2] / 2;
        count[2] %= 2;

        if (count[2] == 1) {
            ans++;
            count[1] = Math.max(0, count[1] - 2);
        }

        ans += (count[1] + 3) / 4;

        System.out.println(ans);

        sc.close();
    }
}
