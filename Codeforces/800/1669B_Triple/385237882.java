// Codeforces: https://codeforces.com/contest/1669/B
// Problem: Triple
// Submission: https://codeforces.com/contest/1669/submission/385237882
// Language: Java 21
// Submitted: 2026-08-02T06:53:55.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            HashMap<Integer, Integer> map = new HashMap<>();
            int ans = -1;

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                map.put(x, map.getOrDefault(x, 0) + 1);

                if (map.get(x) >= 3) {
                    ans = x;
                }
            }
            output.append(ans).append("\n");
        }
        System.out.print(output);
    }
}
