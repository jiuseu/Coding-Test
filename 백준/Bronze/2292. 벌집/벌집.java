import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int a= Integer.parseInt(br.readLine());
       
       int count = 1;
       int range = 2;
        
       if(a==1) {
    	 bw.write(String.valueOf(1));  
       }
       else {
    	   while(range <= a) {
    		   range = range +(6*count);
    		   count++;
    	   }
    	   bw.write(String.valueOf(count));
       }
    	 
    bw.flush();
    bw.close();
       	
	}
}
