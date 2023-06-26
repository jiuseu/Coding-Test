import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());

        for(int i=0;i<a;i++){
            String str = br.readLine();
            String[] arr = str.split("");
            bw.write(String.valueOf(arr[0]+arr[arr.length-1])+"\n");
        }

        bw.flush();
        bw.close();
    }

}
