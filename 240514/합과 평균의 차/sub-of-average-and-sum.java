import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        int avg = (a+b+c)/3;
        int sum = (a+b+c);
        int diff = sum-avg;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(diff);
    }
}