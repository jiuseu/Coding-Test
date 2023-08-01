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
        LinkedList<Integer>q = new LinkedList<Integer>();

        int count = 0;

        for (int i = 1; i <= a; i++) {
            q.add(i);
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<b;i++) {
            int num = Integer.parseInt(st.nextToken());

            int index = q.indexOf(num);
            int half_index = q.size()/2;


            if(index<=half_index) {
                while(num!=q.getFirst()) {
                    q.add(q.removeFirst());
                    count++;
                }
            }

            else {
                while(num!=q.getFirst()) {
                    q.addFirst(q.removeLast());
                    count++;
                }
            }
            q.remove();
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }

}



