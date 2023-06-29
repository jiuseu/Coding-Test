import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n ; i++) {
            for(int j = 0; j < n-i; j++)
                sb.append(" ");
            for(int j = 0; j < i*2-1; j++)
                sb.append("*");
            sb.append("\n");
        }

        for(int i = n-1; i >= 0 ; i--) {
            for(int j = 0; j < n-i; j++)
                sb.append(" ");
            for(int j = 0; j < i*2-1; j++)
                sb.append("*");
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}
