public class coditude {
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

    public static void prime(int n){
        boolean[] prime = new boolean[n+1];
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
    public static void fib(int n){
        int first =0;
        int second =1;
        if(n>=1){
            System.out.println(first+" ");
        }
        if(n==2){
            System.out.println(second+" ");
        }
        for(int i=3;i<=n;i++){

            int next = first + second;
            System.out.println(next+" ");
            first = second;
            second = next;
        }
    }
    public static boolean pal(int n){
        int remainder;
        int num = n;
        int reverse =0;
        while(n!=0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return num == reverse;
    }
    public static int max(int arr[]){
        int max = Integer.MAX_VALUE;
        for(int e: arr){
            if(e < max){
                max = e;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n =121;
        // System.out.println(isprime(n));
        // prime(n);  
        // fib(n);  
        // System.out.println(pal(n));

        int[] arr = {1,2,3,4,5,66,6};
        System.out.println(max(arr));
    }
}
