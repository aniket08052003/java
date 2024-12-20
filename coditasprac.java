public class coditasprac {
    public static boolean isprime(int n){
        if(n==1){
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
    public static void printprime(int n){
        boolean []prime = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }

    public static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0){
            return a;
        }
        else{
            return b;
        }
    }

    public static void fib(int n){
        int first =0;
        int second =1;
        if(n>=1){
            System.out.println(first+" ");
        }
        if(n>=2){

            System.out.println(second+" ");
        }
        for(int i=3;i<=n;i++){
            int next = first+second;
            System.out.println(next+" ");
            first = second;
            second = next;
        }
    }

    public static boolean ispal(int n){
        int remainder;
        int num=n;
        int reverse=0;
        while(n!=0){
            remainder = n%10;
            reverse = reverse *10 + remainder;
            n /= 10;
        }
        return num == reverse;
    }

    public static int arm(int n){
        int sum=0;
        int num=n;
        int noOfDigit = String.valueOf(n).length();
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,noOfDigit);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {

        // PRIME NOS
        // int n=10;
        // System.out.println(isprime(n));
        // printprime(n);

        // GCD AND LCM
        // int a=20;
        // int b = 15;
        // System.out.println(gcd(a, b));
        // System.out.println("LCM is: "+a*b/gcd(a, b));

        // FIBONACCI SERIES
        // int n=10;
        // fib(n);

        // Palindrome
        // int n = 121;
        // System.out.println(ispal(n));

        // ARMSTRONG
        // int n=153;
        // System.out.println(arm(n));
        

    }
}
