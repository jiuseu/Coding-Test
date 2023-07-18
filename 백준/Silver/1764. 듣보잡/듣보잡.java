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
	
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    //StringBuilder sb = new StringBuilder();
    int a = Integer.parseInt(st.nextToken()); 
    int b = Integer.parseInt(st.nextToken());
    ArrayList<String>answer = new ArrayList<String>();
    HashMap<String,String>list = new HashMap<String,String>();
    
    for(int i=0;i<a;i++) {
        String c = br.readLine();
        list.put(c, c);
    }
    
    int cnt = 0;
    
    for(int i=0;i<b;i++) {
      String s = br.readLine();
      if(list.get(s)!=null) {
    	  answer.add(s); 
    	  cnt++; 
      }
    }
    Collections.sort(answer);
    
    bw.write(String.valueOf(cnt)+"\n");
    for(String c:answer) { 	
    	bw.write(c+"\n");
    }
  
    bw.flush();
}
}
