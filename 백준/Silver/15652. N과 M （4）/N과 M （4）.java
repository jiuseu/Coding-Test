import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static StringBuilder sb;
    static int[] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr = new int[b];

        dfs(a,b,1,0);
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void dfs(int a, int b, int start, int zero){

        if(zero == b){
            for(int i:arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= a; i++){
            arr[zero] = i;
            dfs(a,b,i,zero+1);
        }
    }
}

