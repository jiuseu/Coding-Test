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

        int a =Integer.parseInt(br.readLine());
        int [] arr = new int [a];
        int max = 2;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            if(max<=arr[i]) {
                max=arr[i];
            }
            if(min>arr[i]) {
                min=arr[i];
            }
        }

        bw.write(String.valueOf(max*min));
        bw.flush();
        bw.close();
        br.close();

    }

}


