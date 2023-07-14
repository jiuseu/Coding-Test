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

       int a = Integer.parseInt(br.readLine());

       String[] srr = new String[a];

       for(int i=0; i<a; i++){
           srr[i] = br.readLine();
       }

       Arrays.sort(srr, new Comparator<String>() {
           public int compare(String s1, String s2){
               if(s1.length() == s2.length()){
                   return s1.compareTo(s2);
               }
               else{
                   return s1.length() - s2.length();
               }
           }
       });
       LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(srr));
       srr = hashSet.toArray(new String[0]);

       for(int i=0;i<srr.length;i++){
           bw.write(srr[i]+"\n");
       }
       bw.flush();
        bw.close();

        }
    }


