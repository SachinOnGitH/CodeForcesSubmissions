// Codeforces: https://codeforces.com/contest/2275/B
// Problem: Did Not Go to Print
// Submission: https://codeforces.com/contest/2275/submission/393551618
// Language: Java 21
// Submitted: 2026-10-07T15:09:11.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        if (!st.hasMoreTokens()) return;

        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;

            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            String s = br.readLine();
            while (s != null && s.trim().isEmpty()) {
                s = br.readLine();
            }

            Stack<Integer> stack = new Stack<>();
            boolean[] printed = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);
                if (c == '1') {
                    stack.push(i);
                } else if (c == '2') {
                    if (!stack.isEmpty()) {
                        printed[stack.pop()] = true;
                    } else {
                        printed[i] = true;
                    }
                } else if (c == '3') {
                    printed[i] = true;
                }
            }

            ArrayList<Integer> notPrinted = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (!printed[i]) {
                    notPrinted.add(i);
                }
            }

            sb.append(notPrinted.size()).append("\n");
            for (int i = 0; i < notPrinted.size(); i++) {
                sb.append(notPrinted.get(i));
                if (i < notPrinted.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
