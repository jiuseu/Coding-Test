import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String s= st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int num = 1;
        int sum = 0;

        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);

            if('A' <= c && c <= 'Z'){
                sum += (c - 'A'+10) * num;
            }else{
                sum += (c- '0') * num;
            }
            num*= n;
        }
        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }

}
