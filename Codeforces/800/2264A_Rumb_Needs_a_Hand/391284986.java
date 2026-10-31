// Codeforces: https://codeforces.com/contest/2264/A
// Problem: Rumb Needs a Hand
// Submission: https://codeforces.com/contest/2264/submission/391284986
// Language: Java 21
// Submitted: 2026-09-20T04:56:34.000Z
// Rating: 800
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
static StringTokenizer tokenizer;

static String nextToken() throws IOException {
while (tokenizer == null || !tokenizer.hasMoreTokens()) {
String line = reader.readLine();
if (line == null) return null;
tokenizer = new StringTokenizer(line);
}
return tokenizer.nextToken();
}

static int nextInt() throws IOException {
return Integer.parseInt(nextToken());
}

public static void runTestCase() throws IOException {
int size = nextInt();
int[] arr = new int[size + 1];

for (int i = 1; i <= size; ++i) {
arr[i] = nextInt();
}

ArrayList<Integer> badPos = new ArrayList<>();
for (int i = 1; i <= size; ++i) {
if (arr[i] != i) {
badPos.add(i);
}
}

if (badPos.isEmpty()) {
System.out.println("YES");
return;
}

int count = badPos.size();
boolean isOk = true;
for (int i = 0; i < count; ++i) {
int left = badPos.get(i);
int right = badPos.get(count - 1 - i);
if (arr[left] != right) {
isOk = false;
break;
}
}

if (isOk) {
System.out.println("YES");
} else {
System.out.println("NO");
}
}

public static void main(String[] args) throws IOException {
String firstTok = nextToken();
if (firstTok != null) {
int tests = Integer.parseInt(firstTok);
while (tests-- > 0) {
runTestCase();
}
}
}
}
