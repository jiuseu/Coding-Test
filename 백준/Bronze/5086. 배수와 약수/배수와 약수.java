import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0){
                break;
            }

            if(a<b && b%a==0){
                sb.append("factor").append("\n");
            }
            else if(a>b && a%b==0){
                sb.append("multiple").append("\n");
            }
            else{
                sb.append("neither").append("\n");
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}
