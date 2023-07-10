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
        
        Long a = Long.parseLong(br.readLine());

        bw.write(String.valueOf((a*(a-1))/2)+"\n");
        bw.write(String.valueOf(2)+"\n");

        bw.flush();
        bw.close();

        }

    }


