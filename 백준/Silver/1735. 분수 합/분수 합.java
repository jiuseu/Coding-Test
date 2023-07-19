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

            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine()," ");
            int b1 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());

            int ans1 = (a1*b2)+(b1*a2);
            int ans2 = a2*b2;

            int mod = gcd(ans1,ans2);
            ans1 /= mod;
            ans2 /= mod;

        bw.write(String.valueOf(ans1+" "+ans2));
        bw.flush();
        bw.close();

        }

        public static int gcd(int a,int b){

        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
        }


    }


