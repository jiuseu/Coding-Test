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
    
    LinkedHashSet<Integer>list = new LinkedHashSet<Integer>();
    
    for(int i=0;i<10;i++) {
      int a = Integer.parseInt(br.readLine());
      list.add(a%42);
    }
      
      bw.write(String.valueOf(list.size()));
	  bw.flush();
  }
}