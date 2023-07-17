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

        int[] arr1 = new int[a];	
        int[] arr2 = new int[a];	
        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();	// rank를 매길 HashMap


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < a; i++) {
            arr1[i] = arr2[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr2);

        int rank = 0;
        for(int i : arr2) {
            if(!list.containsKey(i)) {
                list.put(i, rank);
                rank++;	
            }
        }

        for(int i : arr1) {
            int num = list.get(i);	
            sb.append(num).append(' ');
        }

        bw.write(String.valueOf(sb));
       bw.flush();
       bw.close();

        }

    }


