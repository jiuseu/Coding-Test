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

        int a =Integer.parseInt(br.readLine());
        HashSet<String> srr = new HashSet<String>();
        srr.add("ChongChong");

        for(int i = 0; i < a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            if(srr.contains(s1)|| srr.contains(s2)){
                srr.add(s1);
                srr.add(s2);
            }
        }

        bw.write(String.valueOf(srr.size()));
        bw.flush();
        bw.close();
        br.close();

    }

}


