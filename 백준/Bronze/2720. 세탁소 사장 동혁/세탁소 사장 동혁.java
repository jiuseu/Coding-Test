import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(br.readLine());
        int[] arr = {25,10,5,1};

        for(int i = 0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
              for(int j=0;j<arr.length;j++){
                  int num = b/arr[j];
                  sb.append(num).append(" ");
                  b%=arr[j];
              }
              sb.append("\n");
        }


        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }

}
