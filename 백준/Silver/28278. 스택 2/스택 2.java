import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static StringBuilder sb;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");
        sb= new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();

        Stack(que,a);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void Stack(Deque<Integer> a,int b)throws IOException {

        for(int i = 0; i < b; i++){
            String s = br.readLine();
            String[] srr = s.split(" ");
            if(Integer.parseInt(srr[0])==1){
                a.offerFirst(Integer.parseInt(srr[1]));
            }
            else if(Integer.parseInt(srr[0])==2){
                if(a.size()==0){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(a.pollFirst()).append("\n");
                }
            }
            else if(Integer.parseInt(srr[0])==3){
                sb.append(a.size()).append("\n");
            }
            else if(Integer.parseInt(srr[0])==4){
                if(a.size()==0){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if(Integer.parseInt(srr[0])==5){
                if(a.size()==0){
                    sb.append(-1).append("\n");
                }
                else{
                    sb.append(a.peek()).append("\n");
                }
            }
        }

    }
}


