import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        ArrayList<Integer> list = new ArrayList<Integer>();
        String s = br.readLine();

        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            list.add((int)(c-'0'));
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i:list){
            bw.write(String.valueOf(i));
        }

        bw.flush();
        bw.close();

        }


    }


