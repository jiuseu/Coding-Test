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
        HashMap<Integer,Integer> arr = new HashMap<Integer,Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < a; i++) {
            int b = Integer.parseInt(st.nextToken());
           if(arr.get(b)!=null){
               arr.put(b,arr.get(b)+1);
           }
           else{
               arr.put(b,1);
           }
        }

        int c = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i < c; i++){
            int b = Integer.parseInt(st.nextToken());
            if(arr.get(b)!=null){
                sb.append(arr.get(b)).append(" ");
            }
            else{
                sb.append(0).append(" ");
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

        }

    }


