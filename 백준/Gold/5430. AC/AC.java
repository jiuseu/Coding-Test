import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static StringBuilder sb;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        sb= new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String b = br.readLine();
            int num = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            Deque<Integer> que = new LinkedList<>();
            for (String s : arr.substring(1, arr.length() - 1).split(",")) {
                if (!s.equals("")) {
                    que.add(Integer.valueOf(s));
                }
            }
            AC(que, b);

        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void AC(Deque<Integer> que, String s) {
        boolean bol = true;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'R') {
                bol = !bol;
            } else {
                if(que.size() == 0) {
                    sb.append("error").append("\n");
                    return;
                }
                if(bol) {
                    que.removeFirst();
                } else {
                    que.removeLast();
                }
            }
        }
        sb.append("[");
        while(!que.isEmpty()) {
            sb.append(bol ? que.removeFirst() : que.removeLast());
            if(que.size() != 0) {
                sb.append(",");
            }
        }
        sb.append(']').append("\n");

    }
}


