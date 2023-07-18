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
    
    HashMap<Integer,Integer>list1 = new HashMap<Integer,Integer>();
    //HashMap<Integer,Integer>list2 = new HashMap<Integer,Integer>();
    //ArrayList<Integer>answer = new ArrayList<Integer>();
    
    st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<a;i++) {
    	int c = Integer.parseInt(st.nextToken());
    	list1.put(c, c);
    }
    
    st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<b;i++) {
    	int c = Integer.parseInt(st.nextToken());
    	if(list1.get(c)!=null) {
    		list1.remove(c);
    	}
    	else {
    		list1.put(c,c);
    	}
    }
    
    bw.write(String.valueOf(list1.size()));
    bw.flush();
}
}
