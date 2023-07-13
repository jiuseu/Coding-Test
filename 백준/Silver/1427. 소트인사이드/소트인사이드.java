import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.text.*;
import java.time.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	//StringTokenizer st = new StringTokenizer(br.readLine());
        //Scanner sc =new Scanner(System.in);
    	//StringBuilder sb=new StringBuilder();
       
       String s = br.readLine();
       char[] ch =s.toCharArray();
       Integer [] arr = new Integer[ch.length];
       
       for(int i=0;i<ch.length;i++) {
    	   arr[i]=(ch[i]-'0');
       }
       
       Arrays.sort(arr,Collections.reverseOrder());
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]);
       }
    
    }

}