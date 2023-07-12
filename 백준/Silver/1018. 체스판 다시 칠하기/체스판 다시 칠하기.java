import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int a;
    static int b;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        String[] arr = new String[a];

        for (int i = 0; i <a; i++) {
            arr[i] = br.readLine();
        }

        bw.write(String.valueOf(cnt(arr)));
        bw.flush();
        bw.close();

        }

    public static int cnt(String[] arr) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < a - 7; i++) {
            for (int j = 0; j < b - 7; j++) {
                for (int k = 0; k < 2; k++) {
                    char start = k == 0 ? 'W' : 'B';

                    int count = 0;
                    for (int n = i; n < i + 8; n++) {
                        for (int m = j; m < j + 8; m++) {
                            if (start != arr[n].charAt(m)) {
                                count++;
                            }

                            start = start == 'W' ? 'B' : 'W';

                        }

                        start = start == 'W' ? 'B' : 'W';
                    }

                    result = Math.min(result, count);

                    if (result == 0) {
                        return 0;
                    }
                }
            }
        }

        return result;
    }

    }


