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

        String s = br.readLine();
        int a = s.length();
        int b = Integer.parseInt(s);
        int ans = 0;

        for(int i = (b - (a * 9)); i < b; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == b) {
                ans = i;
                break;
            }

        }

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();

        }

    }


