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
	
	static boolean [] p;
	static int[] list;
	static StringBuilder sb = new StringBuilder();
	
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    //StringBuilder sb = new StringBuilder();
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    
    list= new int[b];
    p=new boolean[a+1];
    dfs(a,b,1,0);
    
    bw.write(String.valueOf(sb));
    bw.flush();
}
  public static void dfs(int a,int b,int now,int zero) {
	  if(zero==b) {
		  for(int i:list) {
			  sb.append(i).append(' ');
		  }
		  sb.append('\n');
		  return;
	  }
	  
	  for(int i=now;i<=a;i++) {
		list[zero]=i;
		dfs(a,b,i,zero+1);
	  }
	  
  }
}