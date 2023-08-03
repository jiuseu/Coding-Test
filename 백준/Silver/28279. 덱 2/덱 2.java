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
        Deque<Long> que = new LinkedList<>();

        for(int i = 0; i < a; i++){
            String s = br.readLine();
            String[] srr = s.split(" ");
            int num1 = Integer.parseInt(srr[0]);

            if(num1 == 1){
                long num2 = Long.parseLong(srr[1]);
                que.offerFirst(num2);
            }
            else if(num1 == 2){
                long num2 = Long.parseLong(srr[1]);
                que.offerLast(num2);
            }
            else if(num1 == 3){
                if(que.size()!=0){
                   sb.append(que.pollFirst()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(num1 == 4){
                if(que.size()!=0){
                    sb.append(que.pollLast()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(num1 == 5){
                    sb.append(que.size()).append("\n");
            }
            else if(num1 == 6){
                if(que.size()!=0){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(1).append("\n");
                }
            }
            else if(num1 == 7){
                if(que.size()!=0){
                    sb.append(que.peekFirst()).append("\n");
                }
                else{
                    sb.append(-1).append("\n");
                }
            }
            else if(num1 == 8){
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
    }
}


