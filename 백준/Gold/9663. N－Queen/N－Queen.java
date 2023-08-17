import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int[] arr;
    static int a;
    static int count = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        a = Integer.parseInt(br.readLine());
        arr = new int[a];

        nq(0);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static void nq(int num){

        if(num == a){
            count++;
            return;
        }

        for(int i = 0; i < a; i++){
            arr[num] = i;
            if(test(num)){
                nq(num + 1);
            }
        }
    }

    public static boolean test(int num) {

        for (int i = 0; i < num; i++) {
            if (arr[num] == arr[i]) {
                return false;
            }

            else if (Math.abs(num - i) == Math.abs(arr[num] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}

