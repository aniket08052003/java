import java.util.Scanner;

public class prime {
    static boolean isPrime(int n){
        for(int i = 2; i <= n/2; i++){  // for(int i = 2; i <= math.sqrt(n); i++);
            if(n%i == 0){
                return false;
            }
            return true;
        }
        return true;
        
    }

    static boolean checkPrime(int n){
        if(n == 1){
            return false;
        }
        if(n ==2 || n == 3){
            return true;
        }
        if(n%2 == 0 || n%3==0){
            return false;
        }
        for(int i=5; i*i <= n ; i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return true;
            }
        }
        return true;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // boolean res = isPrime(a);
    // if(res){
    //     System.out.println(a+" is prime no.");
    // }else{
    //     System.out.println(a+" is not prime no.");
    // }
    System.out.println(checkPrime(a));
    // System.out.println(isPrime(a));
}
}
