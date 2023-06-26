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
    double [] arr = new double[a];
    double max = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    for(int i=0;i<arr.length;i++) {
       arr[i]=Double.parseDouble(st.nextToken());
       if(max<arr[i]) {
    	   max=arr[i];
       }
    }
     
     int cnt = 0;
     double sum = 0;
     for(double i:arr) {
    	 double b=(arr[cnt]/max)*100;
    	 sum+=b;
    	 cnt++;
     }
     
     bw.write(String.valueOf(sum/a));
     bw.flush();
  }
}