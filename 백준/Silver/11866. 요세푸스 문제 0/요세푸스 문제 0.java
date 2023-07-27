import java.io.*;
import java.math.BigInteger;
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
        int cnt = 1;
        Deque<Integer> que = new LinkedList<Integer>();

        for(int i=0; i<a; i++){
            que.offer(i+1);
        }

        String ans = "<";

        while(!que.isEmpty()){
            if(cnt==b){
                ans+=que.pollFirst()+", ";
                cnt=1;
            }
            else{
                que.offer(que.pollFirst());
                cnt++;
            }
        }

        ans = ans.substring(0,ans.length()-2);
        ans +=">";
        bw.write(ans);
        bw.flush();
        bw.close();
        br.close();

    }

}


