import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer>list = new HashMap<Integer,Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<a;i++) {
            int b = Integer.parseInt(st.nextToken());
            list.put(b, 1);
        }

        int c = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<c;i++) {
            int d = Integer.parseInt(st.nextToken());
            int e = list.getOrDefault(d, 0);
            bw.write(String.valueOf(e)+"\n");
        }
        bw.flush();
        bw.close();

    }

}

