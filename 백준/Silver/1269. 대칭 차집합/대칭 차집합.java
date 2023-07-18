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

        HashMap<Integer,Integer>list = new HashMap<Integer,Integer>();

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.put(num,num);
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(list.get(num)!=null){
                list.remove(num);
            }
            else{
                list.put(num,num);
            }
        }

        bw.write(String.valueOf(list.size()));

        bw.flush();
        bw.close();

        }

    }


