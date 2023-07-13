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

        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i <a; i++) {
            int c = Integer.parseInt(st.nextToken());
            list.add(c);
        }

        Collections.sort(list,Collections.reverseOrder());

        bw.write(String.valueOf(list.get(b-1))+"\n");
        bw.flush();
        bw.close();

        }


    }


