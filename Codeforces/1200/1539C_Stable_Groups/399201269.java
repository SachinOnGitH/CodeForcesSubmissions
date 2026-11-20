// Codeforces: https://codeforces.com/contest/1539/C
// Problem: Stable Groups
// Submission: https://codeforces.com/contest/1539/submission/399201269
// Language: Java 21
// Submitted: 2026-11-20T06:52:22.000Z
// Rating: 1200
import java.util.*;
import java.io.*;
public class Main {
    static void shuffleSort(long[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            long tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        Arrays.sort(arr);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
        shuffleSort(a);
        ArrayList<Long> needs = new ArrayList<>();
        for (int i = 0; i + 1 < n; i++) {
            long d = a[i + 1] - a[i];
            if (d > x) needs.add((d - 1) / x);
        }
        Collections.sort(needs);
        int groups = needs.size() + 1;
        for (long need : needs) {
            if (need <= k) {
                k -= need;
                groups--;
            } else {
                break;
            }
        }
        System.out.println(groups);
    }
}
