import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean[] bol;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bol = new boolean[b+1];
        prime();

        for (int i = a; i < b+1; i++) {
            if (bol[i] == false) {
                sb.append(i).append("\n");
            }
        }

        bw.write(String.valueOf(sb));;
        bw.flush();
        bw.close();

    }

    public static void prime(){

        bol[0] = true;
        bol[1] = true;

        for(int i = 2; i < Math.sqrt(bol.length);i++){
            if(bol[i]==true){
                continue;
            }
            for(int j=i+i;j<bol.length;j+=i){
                bol[j] = true;
            }
        }

    }
}


