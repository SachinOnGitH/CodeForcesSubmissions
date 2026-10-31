// Codeforces: https://codeforces.com/contest/2264/B
// Problem: Knife's Pill Farm
// Submission: https://codeforces.com/contest/2264/submission/391285026
// Language: Java 21
// Submitted: 2026-09-20T04:57:30.000Z
// Rating: 1000
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

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

static long nextLong() throws IOException {
return Long.parseLong(nextToken());
}

public static void runTestCase() throws IOException {
int n = nextInt();
int m = nextInt();

long[] a = new long[n];
for (int i = 0; i < n; ++i) {
a[i] = nextLong();
}

if (m == 1) {
long maxVal = a[0];
for (int i = 1; i < n; ++i) {
if (a[i] > maxVal) maxVal = a[i];
}
System.out.println(maxVal);
return;
}

PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
long sumSmallest = 0;
long maxScore = Long.MIN_VALUE;

for (int i = 0; i < n; ++i) {
if (i >= m - 1) {
long currentScore = (long) m * a[i] - sumSmallest;
if (currentScore > maxScore) {
maxScore = currentScore;
}
}

maxHeap.add(a[i]);
sumSmallest += a[i];

if (maxHeap.size() > m - 1) {
sumSmallest -= maxHeap.poll();
}
}

System.out.println(maxScore);
}

public static void main(String[] args) throws IOException {
String tok = nextToken();
if (tok != null) {
int testCases = Integer.parseInt(tok);
while (testCases-- > 0) {
runTestCase();
}
}
}
}
