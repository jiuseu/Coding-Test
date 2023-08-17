import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int count1 = 1;
    static int count2 = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        test1(a);
        test2(a);

        bw.write(String.valueOf(count1+ " "+count2));
        bw.flush();
        bw.close();
    }

    public static int test1(int n) {
        if(n <= 2) return 1;
        count1++;
        return test1(n - 1) + test1(n - 2);
    }

    public static int test2(int n) {
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= n; i++) {
            count2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}

