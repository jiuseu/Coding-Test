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

            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long ans = gcd(b,c);


        bw.write(String.valueOf(b*c/ans));
        bw.flush();
        bw.close();

        }

        public static long gcd(long a,long b){

        while(b !=0){
            long num = a%b;

            a = b;
            b = num;
        }
        return a;

        }

    }


