import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.*;
import java.text.*;
import java.time.*;
import java.math.*;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//Scanner scan = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(br.readLine());
    //StringBuilder sb = new StringBuilder();

    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    
    System.out.println(ICM(a,b));
  }
public static long GCD(long a,long b) {
	if(b==0) {
		return a;
	}
	long max = Math.max(a, b);
	long min = Math.min(a, b);
	
	return GCD(min, max%min);
}
public static long ICM(long a,long b) {
	return a*b/GCD(a,b);
}
 }