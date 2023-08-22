import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int[] list = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<list.length;i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr,list,arr[0],1);

        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(min)+"\n");
        bw.flush();
        bw.close();
    }

    static void dfs(int[] arr,int[] list,int num,int cnt) {

        if(cnt == arr.length) {
            max = Math.max(num,max);
            min = Math.min(num, min);

            return;
        }

        for(int i=0;i<list.length;i++) {
            if(list[i] != 0) {
                list[i]--;
                switch(i) {
                    case 0: dfs(arr,list,num+arr[cnt],cnt+1);
                        break;
                    case 1: dfs(arr,list,num-arr[cnt],cnt+1);
                        break;
                    case 2: dfs(arr,list,num*arr[cnt],cnt+1);
                        break;
                    case 3: dfs(arr,list,num/arr[cnt],cnt+1);
                        break;
                }
                list[i]++;

            }
        }
    }
}

