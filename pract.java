import java.util.Scanner;
public class pract {

    static boolean isArmstrong(int n){
        int num =n;
        int sum =0;
        int noOfDigits=String.valueOf(n).length();
        while(n!= 0){
            int digit = n%10;
            sum += Math.pow(digit, noOfDigits);
            n /= 10;
        }
        return sum == num;
    }

    static boolean palindrome(int n){
        int num = n;
        int reverse = 0;
        int remainder;
        while(n != 0){
            remainder = n%10;
            reverse = reverse*10 + remainder;
            n /= 10;
        }
        return num == reverse;
    }

    static void fib(int n){
        int first =0;
        int second = 1;
        if(n<=0){
            System.out.println("Error");
        }
        for(int i=1; i<=n; i++){
            if(n==1){
                System.out.println(first+" ");
            }
            if(n==2){
                System.out.println(second+" ");
            }
            
                int next = first + second;
                System.out.println(next+" ");
                first = second;
                second = next;
        }
    }

    static int gabrielGcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
            if(a!=0){
                return a;
            }else{
                return b;
            }
        
    }

    static void printPrime(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=2; i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i; j<=n; j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }

static boolean isPrime(int n){
    if(n==1){
        return false;
    }
    if(n==2 || n==3){
        return true;
    }
    if(n%2==0 || n%3==0){
        return false;
    }
    for(int i=5; i*i<=n;i=i+6){
        if(n%i==0 || n%(i+2)==0){
            return true;
        }
    }
    return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z=sc.nextInt();
        if(isArmstrong(z)){
            System.out.println(z+" is ArmStrong Number");
        }
        else{
            System.out.println(z+" is not");
        }
        // int pal=sc.nextInt();
        // boolean ispal=palindrome(pal);
        // if(ispal){
        //     System.out.println(pal+" is palindrome");
        // }else{
        //     System.out.println(pal+" is not palindrome");
        // }
        // int c = sc.nextInt();
        // int n=sc.nextInt();
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if(isPrime(n)){
        //     System.out.println(n+" is Prime no");
        // }else{
        //     System.out.println(n+" is not prime no");
        // }
        // printPrime(n);
        // System.out.println(gabrielGcd(a, b));
        // System.out.println(a*b/gabrielGcd(a, b));
        // fib(c);

        // 

    }
}
