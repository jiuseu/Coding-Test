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
        HashSet<String> srr = new HashSet<>();
        int cnt = 0;

        while(a --> 0) {
            String s = br.readLine();

            if(s.equals("ENTER")) {
                cnt += srr.size();
                srr.clear();
                continue;
            }
            srr.add(s);
        }

        bw.write(String.valueOf(cnt+ srr.size()));
        bw.flush();
        bw.close();
        br.close();

    }

}


