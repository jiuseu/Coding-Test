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
            long num = Long.parseLong(br.readLine());
            var bi = new BigInteger(String.valueOf(num));

            if (bi.isProbablePrime(10)) {
                System.out.println(num);
            } else {
                System.out.println(bi.nextProbablePrime());
            }
        }

        bw.flush();
        bw.close();

    }
}


