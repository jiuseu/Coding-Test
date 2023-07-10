import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = 0;
        if(a>b){
            if(b>c) max = a;
            else max = (a>c) ? a : c;
        }
        else max = (b>c) ? b : c;

        if(a+b+c-max > max) {
            bw.write(String.valueOf(a+b+c));
        }
        else {
            bw.write(String.valueOf((a+b+c-max)*2-1));
        }
        bw.flush();
        bw.close();

        }

    }


