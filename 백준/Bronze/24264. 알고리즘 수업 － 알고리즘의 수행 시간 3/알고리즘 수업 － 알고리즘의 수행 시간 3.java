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


        long a = Long.parseLong(br.readLine());



        bw.write(String.valueOf(a*a)+"\n");
        bw.write(String.valueOf(2)+"\n");

        bw.flush();
        bw.close();

        }

    }


