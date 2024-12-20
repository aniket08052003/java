import java.util.Scanner;

public class fact {
    static int factorial(int n){
        int mul =1;
        for(int i = 1; i<=n ; i++){
            mul *= i;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        System.out.format("Factorial of %d is: %d",n,factorial(n));
    }
}
