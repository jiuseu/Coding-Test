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
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<a; i++){
            int b = Integer.parseInt(br.readLine());
            if(b==0){
                stack.pop();
            }
            else{
                stack.push(b);
            }
        }

        int sum = 0;
        for(int i:stack){
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }

}


