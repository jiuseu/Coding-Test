import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String s = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
        String[] arr =s.split(" ");
        String a = br.readLine();
        String[] b = a.split("");


        int sum = 0;

        for(int i=0;i<a.length();i++){
            int time = 3;
            for(int j=0;j<arr.length;j++){
                if(arr[j].contains(b[i])){
                    sum+=time;
                    break;
                }
                time++;
            }
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }

}
