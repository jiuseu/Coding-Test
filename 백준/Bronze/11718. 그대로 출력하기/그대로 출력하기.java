import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(true) {
            String a = br.readLine();
            if(a == null || a.isEmpty()) {
                break;
            }
            sb.append(a).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}
