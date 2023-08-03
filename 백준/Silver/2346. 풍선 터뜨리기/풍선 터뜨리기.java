import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> que = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < a; i++){
            int b = Integer.parseInt(st.nextToken());
            int[] arr = {i+1,b};
            que.add(arr);
        }

        while(que.size()>1){
            int[] arr= que.pollFirst();
            sb.append(arr[0]).append(" ");
            int n = arr[1];
            if(n>0) {
                for(int j=1; j<n;j++) {
                    que.offerLast(que.pollFirst());
                }
            }
            else if(n<0){
                for(int j=n;j!=0;j++) {
                    que.offerFirst(que.pollLast());
                }
            }
        }
        sb.append(que.poll()[0]);
        bw.write(String.valueOf(sb)+"\n");
        bw.flush();
        bw.close();
    }
}


