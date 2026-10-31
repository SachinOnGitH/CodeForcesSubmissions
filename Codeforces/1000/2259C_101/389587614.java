// Codeforces: https://codeforces.com/contest/2259/C
// Problem: 101
// Submission: https://codeforces.com/contest/2259/submission/389587614
// Language: Java 21
// Submitted: 2026-09-05T19:13:43.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
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
            int[] a = new int[n];
            List<Integer> ones = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] == 1) {
                    ones.add(i);
                }
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = (a[i] == -1) ? 0 : a[i];
            }

            if (ones.isEmpty()) {
                List<Integer> freeIndices = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (a[i] == -1) {
                        freeIndices.add(i);
                    }
                }

                if (freeIndices.size() >= 2) {
                    ans[freeIndices.get(0)] = 1;
                    ans[freeIndices.get(freeIndices.size() - 1)] = 1;
                } else if (freeIndices.size() == 1) {
                    ans[freeIndices.get(0)] = 1;
                }
            } else {
                int maxExistingScore = 0;
                for (int i = 0; i < ones.size() - 1; i++) {
                    int l = ones.get(i);
                    int r = ones.get(i + 1);
                    boolean allZeros = true;
                    for (int j = l + 1; j < r; j++) {
                        if (a[j] == 1) {
                            allZeros = false;
                            break;
                        }
                    }
                    if (allZeros) {
                        maxExistingScore = Math.max(maxExistingScore, r - l + 1);
                    }
                }

                int firstOne = ones.get(0);
                int lastOne = ones.get(ones.size() - 1);

                int leftOpt = -1;
                int leftScore = 0;
                for (int i = 0; i < firstOne; i++) {
                    if (a[i] == -1) {
                        leftOpt = i;
                        leftScore = firstOne - i + 1;
                        break;
                    }
                }

                int rightOpt = -1;
                int rightScore = 0;
                for (int i = n - 1; i > lastOne; i--) {
                    if (a[i] == -1) {
                        rightOpt = i;
                        rightScore = i - lastOne + 1;
                        break;
                    }
                }

                int bestExtScore = Math.max(leftScore, rightScore);

                if (bestExtScore > maxExistingScore) {
                    if (leftScore >= rightScore) {
                        ans[leftOpt] = 1;
                    } else {
                        ans[rightOpt] = 1;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(ans[i]).append(i == n - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}
