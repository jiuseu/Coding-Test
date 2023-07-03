import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String [][] arr = new String[5][15];

        for(int i=0;i <arr.length;i++){
            String s = br.readLine();
            String[] srr = s.split("");

            for(int j=0;j<s.length();j++){
                arr[i][j] = srr[j];
            }
        }

        for(int i=0;i <15;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i] != null && !arr[j][i].isEmpty()){
                    sb.append(arr[j][i]);
                }
                else{
                    continue;
                }

            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }

}
