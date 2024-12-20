import java.util.Scanner;
public class Googly {
    public static boolean isprime(int n){
        if(n == 1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();

        int sum=0;
        // while(n!=0){
        //     int digit = n%10;
        //     sum += digit;
        //     n /= 10;
        // }
        while(n!=0){
            int x = n%10;
            sum += x;
            n /= 10;
        }
        
        System.out.println(sum);
        if(isprime(sum)){
            System.out.println("GOOGLY");
        }
        else{
            System.out.println("NOT GOOGLY");
        }
    }
}
