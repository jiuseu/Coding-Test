import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String s = br.readLine();
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};


       for(int i=0;i<arr.length;i++){
           if(s.contains(arr[i])){
               s=s.replace(arr[i],"*");
           }
       }

        bw.write(String.valueOf(s.length()));
        bw.flush();
        bw.close();
    }

}
