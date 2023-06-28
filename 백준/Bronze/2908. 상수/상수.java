import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int a100=(a/100);
		int a10=((a/10)%10);
		int a1=(a%10);
		
		int b100=(b/100);
		int b10=((b/10)%10);
		int b1=(b%10);
		
		if(a!=b && a100!=0 && a10!=0 && a1!=0 && b100!=0 && b10!=0 && b1!=0) {
			a = ((a%10)*100)+(((a/10)%10)*10)+(a/100);
			b = ((b%10)*100)+(((b/10)%10)*10)+(b/100);
		
			if(a>b) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}else {
			System.out.println("a와 b의 수가 같거나 0이 포함되어 있습니다.");
		}
		
		
		
	}
 
}