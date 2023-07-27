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
        Deque<Integer> que = new LinkedList<Integer>();

        for(int i = 0; i < a; i++){
            String s = br.readLine();

            if(s.contains("push")){
                String[] srr = s.split(" ");
                int num = Integer.parseInt(srr[1]);
                que.add(num);
            }
            else if(s.contains("pop")){
                if(que.size()!=0){
                    sb.append(que.poll()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(s.contains("size")){
                sb.append(que.size()).append("\n");
            }
            else if(s.contains("empty")){
                if(que.size()!=0){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(1).append("\n");
                }
            }
            else if(s.contains("front")){
                if(que.size()!=0){
                    sb.append(que.peekFirst()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(s.contains("back")){
                if(que.size()!=0){
                    sb.append(que.peekLast()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }

        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }

}


