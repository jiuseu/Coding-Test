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
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());
        int ans = a * (a-1);

        bw.write(String.valueOf(ans));;
        bw.flush();
        bw.close();

    }

}


