import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean check[] = new boolean[26]; 
            boolean bol = true; 

            for (int j = 0; j < s.length(); j++) {
                int a = s.charAt(j)-'a';
                if(check[a]) { 
                    if(s.charAt(j) != s.charAt(j-1)) {
                        bol = false; 
                        break;
                    }
                }else { 
                    check[a] = true;
                }
            }
            if(bol) {
                count++;   
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}
