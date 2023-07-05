import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(true){
            int a = Integer.parseInt(br.readLine());
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<Integer>();

            if(a==-1){
                break;
            }

            for(int i =1;i<a;i++){
              if(a%i==0){
                  list.add(i);
                  sum+=i;
              }
            }

            if(a==sum){
                sb.append(a+" = ");
                for(int i=0;i<list.size();i++){
                    if(i==list.size()-1){
                        sb.append(list.get(i)).append("\n");
                    }
                    else{
                        sb.append(list.get(i)+" + ");
                    }

                }
            }
            else{
                sb.append(a+" is NOT perfect.").append("\n");
            }

        }

            bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }

}
