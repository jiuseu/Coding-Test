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
    
    int a =Integer.parseInt(st.nextToken());
    int b =Integer.parseInt(st.nextToken());
    
    ArrayList<Integer>list = new ArrayList<Integer>();
    
    st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<a;i++) {
      int c =Integer.parseInt(st.nextToken());
      list.add(c);
    }
    
    
    int min = Integer.MAX_VALUE;
    int ans = 0;
    
    for(int i=0;i<list.size()-2;i++) {
    	int sum = 0;
      for(int j=i+1;j<list.size()-1;j++) {
    	  
    	  for(int k=j+1;k<list.size();k++) {
    		sum=list.get(i)+list.get(j)+list.get(k);
    		if(b>=sum && min>Math.abs(b-sum)) {
    			min=Math.abs(b-sum);
    			ans=sum;
    		}
    	  }
      }
    }
    bw.write(String.valueOf(ans));	
    bw.flush();
}
}