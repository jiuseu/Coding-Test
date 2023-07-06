import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean prime[];

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        prime = new boolean[b + 1];
        get_prime();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i= a; i <=b; i++){
            if(prime[i] == false){
                sum += i;
                if(min == Integer.MAX_VALUE){
                    min = i;
                }
            }
        }

        if(sum == 0){
            bw.write(String.valueOf(-1)+"\n");
        }
        else{
            bw.write(String.valueOf(sum)+"\n");
            bw.write(String.valueOf(min)+"\n");
        }

        bw.flush();
        bw.close();
    }

    public static void get_prime(){
        prime[0] = true;
        prime[1] = true;

        for(int i=2;i <= Math.sqrt(prime.length);i++){
            if(prime[i])continue;

            for(int j=i*i; j < prime.length; j+=i){
                prime[j] = true;
            }
        }
    }

}
