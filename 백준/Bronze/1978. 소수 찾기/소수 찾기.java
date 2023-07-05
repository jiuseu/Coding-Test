import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<n;i++){
            int a =Integer.parseInt(st.nextToken());
            int num = 0;
            for(int j=1;j<=a;j++){
                if(a%j==0){
                    num++;
                }
            }
            if(num==2){
                count++;
            }
        }
        System.out.print(count);
    }
}