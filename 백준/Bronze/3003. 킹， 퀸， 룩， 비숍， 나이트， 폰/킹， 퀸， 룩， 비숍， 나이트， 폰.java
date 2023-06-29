import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = {1,1,2,2,2,8};
        String s = br.readLine();
        String[] srr = s.split(" ");

        for(int i=0;i<6;i++){
            int a = Integer.parseInt(srr[i]);
            sb.append(arr[i]-a).append(" ");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}
