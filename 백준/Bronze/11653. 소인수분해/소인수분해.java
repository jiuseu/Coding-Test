import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean[] prime;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());
        int b = a;
        prime = new boolean[a+1];
        get_prime();

        while(true){
            for(int i=2; i<prime.length; i++){
                if(!prime[i] && a%i==0){
                    a/=i;
                    sb.append(i).append("\n");
                    break;
                }
            }

            if(a <2){
                break;
            }
        }

        if(b!=1){
            bw.write(String.valueOf(sb));
        }
        else{
            bw.write(String.valueOf(""));
        }

        bw.flush();
        bw.close();
    }

    public static void get_prime(){
        prime[0] = true;
        prime[1] = true;

        for(int i=2;i<=Math.sqrt(prime.length);i++){
            if(prime[i]){
                continue;
            }
            for(int j=i*i;j<prime.length;j+=i){
                if(prime[j]==false){
                    prime[j] = true;
                }
            }
        }
    }



}
