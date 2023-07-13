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

        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i <5; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
            list.add(a);
        }

        Collections.sort(list);

        bw.write(String.valueOf(sum/5)+"\n");
        bw.write(String.valueOf(list.get(2))+"\n");
        bw.flush();
        bw.close();

        }


    }


