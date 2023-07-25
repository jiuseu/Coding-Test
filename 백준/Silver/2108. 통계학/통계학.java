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

        int a =Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int sum = 0;

        for(int i = 0; i < a; i++){
            int b = Integer.parseInt(br.readLine());
           arr[i] = b;
           sum+=b;
        }

        Arrays.sort(arr);

        boolean bol = false;
        int max = 0;
        int mode = 10000;

        for(int i = 0; i < a; i++) {
            int jump = 0;	
            int cnt = 1;
            int num = arr[i];

            for(int j = i + 1; j < a; j++){
                if(num != arr[j]) {
                    break;
                }
                cnt++;
                jump++;
            }

            if(cnt > max) {
                max = cnt;
                mode = num;
                bol = true;
            }
            else if(cnt == max && bol == true) {
                mode = num;
                bol = false;
            }

            i += jump;
        }


        bw.write(String.valueOf((int)Math.round((double)sum / a)+"\n"));
        bw.write(String.valueOf(arr[a / 2])+"\n");
        bw.write(String.valueOf(mode)+"\n");
        bw.write(String.valueOf(arr[a - 1] - arr[0])+"\n");
        bw.flush();
        bw.close();
        br.close();

    }

}


