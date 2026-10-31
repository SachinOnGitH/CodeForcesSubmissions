// Codeforces: https://codeforces.com/contest/1352/A
// Problem: Sum of Round Numbers
// Submission: https://codeforces.com/contest/1352/submission/384745704
// Language: Java 21
// Submitted: 2026-07-29T11:06:03.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        String tLine = br.readLine();
        if (tLine == null) return;
        int t = Integer.parseInt(tLine.trim());

        while (t-- > 0) {
            String nStr = br.readLine().trim();
            List<Integer> roundNumbers = new ArrayList<>();
            int length = nStr.length();


            for (int i = 0; i < length; i++) {
                char digitChar = nStr.charAt(i);
                if (digitChar != '0') {
                    int digit = digitChar - '0';

                    int placeValue = (int) Math.pow(10, length - 1 - i);
                    roundNumbers.add(digit * placeValue);
                }
            }


            sb.append(roundNumbers.size()).append("\n");
            

            for (int i = 0; i < roundNumbers.size(); i++) {
                sb.append(roundNumbers.get(i));
                if (i < roundNumbers.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
