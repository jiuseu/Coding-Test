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
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[a];
        Deque<Integer> que = new ArrayDeque<>();

        for(int i = 0; i < a; i++){
          arr[i] = Integer.parseInt(st1.nextToken());
          int num = Integer.parseInt(st2.nextToken());
          if(arr[i] == 0){
              que.offerLast(num);
          }
        }

        int b = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < b; i++){
            int num = Integer.parseInt(st3.nextToken());
            que.offerFirst(num);
            sb.append(que.pollLast()+" ");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}


