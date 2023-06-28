import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine()," ");
            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            for(byte val : c.getBytes()){
                for(int j=0;j<b;j++){
                    sb.append((char)val);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}