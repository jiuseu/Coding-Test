import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.lang.reflect.Array;
import java.text.*;
import java.time.*;
import java.math.*;

public class Main {
	
  static HashMap<Integer,Integer>arr;
	
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner sc = new Scanner(System.in);
    //StringTokenizer st = new StringTokenizer(br.readLine()," ");
    //StringBuilder sb = new StringBuilder();
    
    int a = Integer.parseInt(br.readLine());
    arr=new HashMap<>();
    
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<a;i++) {
      int c = Integer.parseInt(st.nextToken());
      if(arr.get(c)!=null) {
    	  arr.put(c, arr.get(c)+1);   
      }
      else {
    	  arr.put(c, 1);
      } 	  
      
    }
    
    int b = Integer.parseInt(br.readLine());
    
    st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<b;i++) {
    	int d = Integer.parseInt(st.nextToken());
    	if(arr.get(d)!=null) {
    		bw.write(String.valueOf(arr.get(d))+" ");	
    	}
    	else {
    		bw.write(String.valueOf(0)+" ");
    	}
    	
    }
   
    bw.flush();
    
}
}
