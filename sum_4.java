import java.util.*;
import java.lang.Math;

public class DriverMain {
    public static int Fact(int N) {
        int fact  = 1;
        for(int i=2;i<=N;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt(); 
        double sum = 0;
        int count = 1;
        for(int j = n; j>0; j--){
            sum = sum + (Math.pow(x,j)/(Fact(j)*Fact(x-count)));
            count++;             
        }
        System.out.printf("%.2f",sum);
    }
}
