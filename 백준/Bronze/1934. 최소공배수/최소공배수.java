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

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int ans = gcd(b,c);
            sb.append(b*c/ans).append("\n");

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

        }

        public static int gcd(int a,int b){

        while(b !=0){
            int num = a%b;

            a = b;
            b = num;
        }
        return a;

        }

    }


