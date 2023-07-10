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


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a ==0 && b==0 && c==0){
                break;
            }

            if(a==b && b==c){
                sb.append("Equilateral").append("\n");
            }
            else if ((a >= b + c) || (b >= a + c) || (c >= a + b)){
                sb.append("Invalid").append("\n");
            }
            else if ((a == b) && (a != c) || (a == c) && (a != b) || (b == c) && (b != a)){
                sb.append("Isosceles").append("\n");
            }
            else if ((a != b) && (b != c) && (a != c)){
                sb.append("Scalene").append("\n");
            }
            else{
                sb.append("Invalid").append("\n");
            }

        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

        }

    }


