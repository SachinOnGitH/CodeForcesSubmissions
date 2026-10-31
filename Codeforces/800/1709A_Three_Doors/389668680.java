// Codeforces: https://codeforces.com/contest/1709/A
// Problem: Three Doors
// Submission: https://codeforces.com/contest/1709/submission/389668680
// Language: Java 21
// Submitted: 2026-09-06T15:51:45.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main7 {
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
            int x = Integer.parseInt(line.trim());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] keys = new int[4];
            keys[1] = Integer.parseInt(st.nextToken());
            keys[2] = Integer.parseInt(st.nextToken());
            keys[3] = Integer.parseInt(st.nextToken());

            int nextKey = keys[x];
            if (nextKey == 0) {
                System.out.println("NO");
                continue;
            }

            int finalKey = keys[nextKey];
            if (finalKey == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
