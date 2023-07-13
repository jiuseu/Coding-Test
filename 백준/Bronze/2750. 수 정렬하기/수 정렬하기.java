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
    	
    	int a = Integer.parseInt(br.readLine());
    	int [] arr = new int[a];
         
         for(int i=0;i<a;i++) {
        	 arr[i] = Integer.parseInt(br.readLine());
        	 
         }
         Arrays.sort(arr);
         
         for(int i=0;i<a;i++) {
        	 bw.write(String.valueOf(arr[i])+"\n");
        	 
         }
        

bw.flush();
bw.close();
br.close();
			
}

}