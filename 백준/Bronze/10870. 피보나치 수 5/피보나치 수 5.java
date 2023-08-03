import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(fact(a)));
        bw.flush();
        bw.close();
    }

    public static long fact(int n){

        if(n <= 1){
            return n;
        }
        else{
            return fact(n-2) + fact(n-1);
        }
    }
}


