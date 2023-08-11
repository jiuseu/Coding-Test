import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int a,b;
    static int[] list;
    static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        sb= new StringBuilder();
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        list= new int[b];
        dfs(1,0);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void dfs(int start,int zero) {
        if(zero==b) {
            for(int i:list) {
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=start;i<=a;i++) {
            list[zero] = i;
            dfs(i+1, zero+1);
        }

    }
}


