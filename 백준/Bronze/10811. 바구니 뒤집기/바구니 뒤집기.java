import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            for(int j=a; j<=b; j++) {
                int c = b--;
                int temp = arr[j];
                arr[j] = arr[c];
                arr[c] = temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            bw.write(String.valueOf(arr[i])+" ");
        }
        bw.flush();
        bw.close();
    }

}
