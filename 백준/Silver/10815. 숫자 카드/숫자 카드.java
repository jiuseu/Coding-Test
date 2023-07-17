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
        Set<Integer> list = new HashSet<Integer>();


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        int b = Integer.parseInt(br.readLine());
        int[] arr = new int[b];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(list.contains(num)){
                bw.write(String.valueOf(1)+" ");
            }
            else{
                bw.write(String.valueOf(0)+" ");
            }
        }
        
        bw.flush();
        bw.close();

        }

    }


