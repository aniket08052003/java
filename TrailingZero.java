import java.util.Scanner;

public class TrailingZero {

    static int zero(int n){
        int res = 0;
        int powerOf5 = 5;
        while(n >= powerOf5){
            res = res + (n/powerOf5);
            powerOf5 = powerOf5 * 5;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Factorial number: ");
        int n = sc.nextInt();
        // System.out.format("The number of Zero's in %d! are %d",n,zero(n));
        System.out.println("The no of zero's in "+n+"! are "+zero(n));
    }
}
