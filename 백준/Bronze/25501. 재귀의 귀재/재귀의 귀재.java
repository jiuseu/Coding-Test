import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int cnt;
    static String str;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            str = br.readLine();
            cnt = 0;
            bw.write(String.valueOf(isPalindrome(0, str.length() - 1) + " " + cnt)+"\n");
        }

        bw.flush();
        bw.close();
    }

    public static int isPalindrome(int a, int b) {
        cnt++;
        if (a >= b) {
            return 1;
        }else if(str.charAt(a) != str.charAt(b)) {
            return 0;
        }else {
            return isPalindrome(a + 1, b - 1);
        }

    }
}


