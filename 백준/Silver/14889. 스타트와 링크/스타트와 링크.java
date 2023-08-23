import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int a;
    static int[][] arr;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        arr = new int[a][a];
        visit = new boolean[a];


        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < a; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        test(0, 0);
        System.out.println(Min);

    }


    static void test(int idx, int count) {

        if(count == a / 2) {
            answer();
            return;
        }

        for(int i = idx; i < a; i++) {

            if(!visit[i]) {
                visit[i] = true;
                test(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    static void answer() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {

                if (visit[i] == true && visit[j] == true) {
                    start += arr[i][j];
                    start += arr[j][i];
                }

                else if (visit[i] == false && visit[j] == false) {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);

    }
}

