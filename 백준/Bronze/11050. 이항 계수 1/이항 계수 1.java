import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(factorial(a) / (factorial(a - b) * factorial(b))));
        bw.flush();
        bw.close();
    }

    static int factorial(int c) {
        // factorial(0) == 1 이다.
        if (c <= 1)	{
            return 1;
        }
        return c * factorial(c- 1);
    }

}


