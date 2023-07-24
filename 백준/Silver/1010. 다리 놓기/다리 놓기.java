import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[][] arr = new int[30][30];

        for (int i = 0; i < 30; i++) {
            arr[i][i] = 1;
            arr[i][0] = 1;
        }


        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {

            StringTokenizer  st = new StringTokenizer(br.readLine(), " ");

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(arr[c][b]).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

    }

}


