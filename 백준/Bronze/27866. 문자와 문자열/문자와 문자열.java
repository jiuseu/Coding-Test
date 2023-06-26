import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String str = br.readLine();
        String[] arr = str.split("");
        int a = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(arr[a-1]));

        bw.flush();
        bw.close();
    }

}
