import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [][] arr = new int[9][9];
        int max = -1;
        int x = 0;
        int y = 0;

        for(int i=0;i <9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }

        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(x+" "+y));
        bw.flush();
        bw.close();
    }

}
