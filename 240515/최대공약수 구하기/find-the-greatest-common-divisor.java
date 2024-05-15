import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    static String nextToken(){
        try{
            if(stk==null || !stk.hasMoreTokens()){
                stk = new StringTokenizer(br.readLine());
            }
            return stk.nextToken();
        } catch(Exception e){
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(nextToken());
        int m = Integer.parseInt(nextToken());
        int result;
        if(n==m){
            result = n;
        } else if(n<m){
            result = solve(n,m);
        } else {
            result = solve(m,n);
        }
        System.out.println(result);
    }
    static int solve(int a, int b){
        int result = 1;
        for(int i=1;i<=a;i++){
            if(b%i==0 && a%i==0){
                result = i;
            }
        }
        return result;
    }
}