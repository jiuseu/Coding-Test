import java.util.*;
import java.util.stream.Stream;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
      
        int a = Integer.parseInt(br.readLine());
        int [] arr = new int[a+1];
        
        
       for(int i=0;i<arr.length;i++) {
    	   if(i>=2) {
    		   arr[i]=arr[i-1]+arr[i-2];
    	   }
    	   else if(i<2) {
    		   arr[i]=i;
    	   }
    	   
       }
       System.out.println(arr[a]);
        }
        
    }  