import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int b,tmp[];
    static int answer = -1;
    static int count = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        st = new StringTokenizer(br.readLine());
        tmp = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,0,arr.length-1);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

static void mergeSort(int arr[], int min, int max) {

        if (min < max) {
            int mid = (min + max) / 2;
            mergeSort(arr, min, mid);
            mergeSort(arr,mid + 1, max);
            merge(arr, min, mid, max);
        }
    }

   static void merge(int arr[], int min, int mid, int max) {
        int i = min;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= max) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        while (j <= max) {
            tmp[t++] = arr[j++];
        }

        i = min;
        t = 0;

        while (i <= max) {
            count++;
            if (count == b) {
                answer = tmp[t];
                break;
            }
            arr[i++] = tmp[t++];
        }
    }
}


