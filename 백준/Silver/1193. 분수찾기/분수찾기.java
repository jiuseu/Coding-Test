import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int line = 1;
        int top = 0;
        int bot = 0;

        while(count < x) {
            count = count + line;
            line++;
        }

        if((line-1)%2 == 0) {
            bot = 1 + (count - x);
            top = (line-1) - (count-x);
        }else {
            bot = (line-1) - (count-x);
            top = 1 + (count - x);
        }

        bw.write(String.valueOf(top+"/"+bot));

        bw.flush();
        bw.close();
    }

}
