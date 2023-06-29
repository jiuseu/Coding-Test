import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int [] arr = new int[26];
        String s = br.readLine().toLowerCase();

        for(int i =0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }

        int max = -1;
        char ch = '?';

        for(int i=0;i<26;i++){
            if(arr[i]>max){
                max=arr[i];
                ch = (char) (i+65);
            }
            else if(arr[i]==max){
                ch='?';
            }
        }
        
        bw.write(String.valueOf(ch));
        bw.flush();
        bw.close();
    }

}
