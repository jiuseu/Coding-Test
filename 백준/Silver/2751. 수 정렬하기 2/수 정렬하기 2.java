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
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <a; i++) {
            int b = Integer.parseInt(br.readLine());
            list.add(b);
        }

        Collections.sort(list);

        for(int i:list){
            bw.write(String.valueOf(i)+"\n");
        }

        bw.flush();
        bw.close();

        }


    }


