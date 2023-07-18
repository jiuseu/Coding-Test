import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<String,String> srr = new HashMap<String,String>();
        HashMap<Integer,String> arr = new HashMap<Integer,String>();

        for(int i = 0; i < a; i++) {

           String s1 = br.readLine();
           srr.put(s1,String.valueOf(i+1));
            srr.put(String.valueOf(i+1),s1);
        }

        for(int i=0; i < b; i++){
            String s = br.readLine();

            if(srr.containsKey(s)){
                sb.append(srr.get(s)).append("\n");
            }
            if(arr.containsKey(s)){
                sb.append(arr.get(s)).append("\n");
            }
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();

        }

    }


