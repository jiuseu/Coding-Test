import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringBuilder sb= new StringBuilder();
        sb= new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, a) - 1)).append('\n');

        Hanoi(a, 1, 2, 3);
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void Hanoi(int num, int start, int mid, int move) {

        if (num == 1) {
            sb.append(start + " " + move + "\n");
            return;
        }
        Hanoi(num - 1, start, move, mid);
        sb.append(start + " " + move + "\n");
        Hanoi(num - 1, mid, start, move);
    }

}


