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
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	//StringBuilder sb=new StringBuilder();
    	
       int a =Integer.parseInt(st.nextToken());
       int b =Integer.parseInt(st.nextToken());
       ArrayList<Integer>list=new ArrayList<Integer>();
       
       for(int i=0;i<a;i++) {
    	   if(a%(i+1)==0) {
    		   list.add(i+1);
    	   }
    	  
       }
       Collections.sort(list);
       if(list.size()<b) {
    	   bw.write(String.valueOf(0));    
       }
       else{
    	   bw.write(String.valueOf(list.get(b-1)));   	
       }
       bw.flush();
       bw.close();
       br.close();
    }

}