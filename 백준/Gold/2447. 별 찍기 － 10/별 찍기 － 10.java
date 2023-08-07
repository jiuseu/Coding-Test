import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static StringBuilder sb= new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //StringBuilder sb= new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                f(i,j);
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void f(int x, int y) {

        if(x < 3 && y < 3) {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                sb.append("*");
            }
        } else {
            if(x % 3 == 1 && y % 3 == 1) {
                sb.append(" ");
            }
            else {
                f(x/3,y/3);
            }
        }
    }

}


