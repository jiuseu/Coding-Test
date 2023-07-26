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

        while(true) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<Character>();

            if(input.equals(".")){
                break;
            }

            for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if(ch == '(' || ch == '['){
                    stack.push(ch);
                }

                if(ch == ')') {
                    if(stack.empty()) {
                        stack.push(ch);
                        break;
                    }
                    if(stack.peek() == '(') {
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }else if(ch == ']') {
                    if(stack.empty()) {
                        stack.push(ch);
                        break;
                    }

                    if(stack.peek() == '['){
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
            }

            if(stack.isEmpty()){
                sb.append("yes").append("\n");
            }
            else {
                sb.append("no").append("\n");
            }
        }


        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
        br.close();

    }

}


