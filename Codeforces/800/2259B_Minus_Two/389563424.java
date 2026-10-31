// Codeforces: https://codeforces.com/contest/2259/B
// Problem: Minus Two
// Submission: https://codeforces.com/contest/2259/submission/389563424
// Language: Java 21
// Submitted: 2026-09-05T16:36:56.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line == null || line.trim().isEmpty()) {
                line = br.readLine();
            }
            int n = Integer.parseInt(line.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int oddCount = 0;
            int evenMod0 = 0;
            int evenMod2 = 0;

            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());

                if (val % 2 != 0) {
                    oddCount++;
                } else {
                    if (val % 4 == 0) {
                        evenMod0++;
                    } else {
                        evenMod2++;
                    }
                }
            }

            int ans = Math.max(oddCount, Math.max(evenMod0, evenMod2));
            System.out.println(ans);
        }
    }
}
