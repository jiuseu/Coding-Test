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
    //StringTokenizer st = new StringTokenizer(br.readLine()," ");
    //StringBuilder sb = new StringBuilder();
    
    int a = Integer.parseInt(br.readLine());
    Deque<Integer>q = new LinkedList<Integer>();
    
    for(int i=0;i<a;i++) {
      q.offer(i+1);
    }
    
    while(true) {
      if(q.size()==1) {
    	  bw.write(String.valueOf(q.poll()));
    	  break;
      }
    	q.poll();
    	q.offerLast(q.poll());
    }
    
    bw.flush();
}
}