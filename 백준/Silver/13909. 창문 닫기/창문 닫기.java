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
        int num = (int)Math.sqrt(a);

        bw.write(String.valueOf(num));;
        bw.flush();
        bw.close();

    }

}


