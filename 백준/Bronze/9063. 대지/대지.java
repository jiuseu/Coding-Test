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

       int min_x = 10001;
       int min_y = 10001;
       int max_x = -10001;
       int max_y = -10001;

       for(int i=0; i<a;i++){
           StringTokenizer st = new StringTokenizer(br.readLine()," ");
           int x = Integer.parseInt(st.nextToken());
           if(x<min_x){
               min_x = x;
           }
           if(x>max_x){
               max_x = x;
           }
           int y = Integer.parseInt(st.nextToken());
           if(y<min_y){
               min_y = y;
           }
           if(y>max_y){
               max_y = y;
           }
       }

       int sum = (max_x-min_x)*(max_y-min_y);

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }

}
