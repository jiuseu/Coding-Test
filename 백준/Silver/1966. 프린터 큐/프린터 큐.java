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

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            Deque<int[]> que = new LinkedList<>();

            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < b; j++) {
                int d = Integer.parseInt(st.nextToken());
                que.add(new int[] {j,d});
            }

            int cnt = 0;
            while (true) {
                int now[] = que.poll();
                boolean flag = true;

                for (int[] q : que) {
                    if(q[1] > now[1]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    cnt++;
                    if(now[0] == c){
                        break;
                    }
                }
                else {
                    que.add(now);
                }
                }
            bw.write(String.valueOf(cnt)+"\n");
            }
        bw.flush();
        bw.close();
        br.close();

    }

}



