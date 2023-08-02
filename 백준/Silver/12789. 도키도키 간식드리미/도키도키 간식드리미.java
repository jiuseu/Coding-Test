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
        int cnt = 1;
        String ans = "Nice";
        Deque<Integer> que = new LinkedList<>();
        Deque<Integer> wait = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < a; i++){
            que.offerLast(Integer.parseInt(st.nextToken()));
        }

        while(!que.isEmpty()) {
            if(que.peek() != cnt) {
                if(!wait.isEmpty() && wait.peek() == cnt) {
                    wait.pollFirst();
                    cnt++;
                }
                else {
                    wait.offerFirst(que.pollFirst());
                }
            } else {
                que.pollFirst();
                cnt++;
            }
        }

        while(!wait.isEmpty()) {
            if(wait.peek() != cnt) {
                ans="Sad";
                break;
            } else {
                wait.pollFirst();
                cnt++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}


