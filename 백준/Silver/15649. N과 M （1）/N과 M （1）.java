import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean [] p;
    static int[] list;
    static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        sb= new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        list= new int[b];
        p=new boolean[a+1];
        dfs(a,b,0);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void dfs(int a,int b,int zero) {
        if(zero==b) {
            for(int i:list) {
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1;i<=a;i++) {
            if(!p[i]) {
                list[zero]=i;
                p[i]=true;
                dfs(a,b,zero+1);
                p[i]=false;
            }
        }

    }
}


