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

        for(int i=0; i<a; i++){
            Stack<Character> stack = new Stack<Character>();
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(stack.size()==0){
                    stack.push(c);
                }
                else if(c==')' && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
            if(stack.size()==0){
                sb.append("YES").append("\n");
            }
            else{
                sb.append("NO").append("\n");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }

}


