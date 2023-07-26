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
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        while(a > 0){
            int num =Integer.parseInt(br.readLine());
            if(num>cnt){
                for(int i=cnt+1; i<=num; i++){
                    stack.push(i);
                    sb.append("+").append('\n');
                }
                cnt=num;
            }
            else if(stack.peek() != num){
                bw.write("NO");
                sb.delete(0,sb.length());
                break;
            }
            stack.pop();
            sb.append('-').append('\n');
            a--;
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }

}


