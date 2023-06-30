import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        //StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String[] srr = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        double avr = 0.0;
        double sum = 0.0;

        for(int i=0; i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            String[] s = st.nextToken().split(" ");
            if(!s[2].equals("P")){
                double a = Double.parseDouble(s[1]);
                double b = 4.5;

                for(int j=0; j<srr.length;j++){
                    if(s[2].equals(srr[j]) && !s[2].equals("F")){
                        break;
                    }
                    b-=0.5;
                }
                avr +=(a*b);
                sum +=a;
            } else{
                continue;
            }
        }

        bw.write(String.format("%.6f",avr/sum)+"\n");
        bw.flush();
        bw.close();
    }

}
