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
        int[] arr = new int[a];
        for(int i =0; i < a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] brr = new int[a-1];
        for(int i=0; i <a-1;i++){
            brr[i] = arr[i+1] - arr[i];
        }

        int num = 0;
        num = gcd(brr[0],brr[1]);
        for(int i = 2; i < a-2; i++){
            num = gcd(num, brr[i]);
            if(num == 1)
                break;
        }

        int ans = 0;
        for(int i = 0; i < a-1; i++){
            ans += ((brr[i] / num) - 1);
        }

        bw.write(String.valueOf(ans));
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


