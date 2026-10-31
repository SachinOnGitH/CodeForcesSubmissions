// Codeforces: https://codeforces.com/contest/1760/A
// Problem: Medium Number
// Submission: https://codeforces.com/contest/1760/submission/385250249
// Language: Java 21
// Submitted: 2026-08-02T08:37:10.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int[] nums = new int[3];

        for (int i = 0; i < t; i++) {
            line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);

            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(nums);

            sb.append(nums[1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
