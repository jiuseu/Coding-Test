import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.lang.reflect.Array;
import java.text.*;
import java.time.*;
import java.math.*;

class Main {
  
  static StringBuilder sb;
	
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    
    
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    Deque<Integer>q = new LinkedList<Integer>();
    
    for(int i=0;i<a;i++) {
      q.offer(i+1);	
    }
    
    int cnt = 0;
    
    String ans ="<";
    
    while(!q.isEmpty()) {
    	cnt++;
    	
        if(cnt==b) {
        int x =q.poll();	
        ans+=x+", ";
        cnt = 0;
    	}
        else {
         int x =q.poll();
         q.offerLast(x);
         
        }
        
    }
    ans=ans.substring(0,ans.length()-2);
    ans+=">";
    bw.write(ans);
    bw.flush();

}
}