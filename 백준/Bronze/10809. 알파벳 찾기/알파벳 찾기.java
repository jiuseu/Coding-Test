import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        char[] arr = new char[26];
        int[] arr2 = new int[26];
        int s = 97;
        String str = br.readLine();

        for(int i = 0; i < arr.length; i++){
            arr[i] = (char)s;
            s++;
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            for(int j=0; j<arr.length; j++){
                if(c==arr[j]){
                    if(arr2[j]==-1){
                        arr2[j] = i;
                    }

                }
            }
        }

        for(int i:arr2){
            bw.write(String.valueOf(i)+" ");
        }

        bw.flush();
        bw.close();
    }

}
