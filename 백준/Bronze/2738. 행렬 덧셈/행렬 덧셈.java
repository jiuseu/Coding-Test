import java.io.*;
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

        int[][] arr = new int[a][b];
        int[][] brr = new int[a][b];

        for(int i=0;i<arr.length;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<b;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<brr.length;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<b;j++){
                brr[i][j] = Integer.parseInt(st.nextToken())+arr[i][j];
                sb.append(brr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}
