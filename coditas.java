import java.util.Arrays;

public class coditas {

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
        for(int i =5; i*i<=n;i++){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void print(int n){
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
            int next = first + second;
            System.out.println(next+" ");
            first = second;
            second = next;
        }
    }

    public static int gcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static boolean pal(int n){
        int num = n;
        int remainder;
        int reverse=0;
        while(n!=0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return num == reverse;
    }
    public static boolean arm(int n){
        int num =n;
        int noOfDigit = String.valueOf(n).length();
        int sum =0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,noOfDigit);
            n /= 10;
        }
        return sum == num;
    }

    // Arrays

    public static void reverseArray(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }

    public static void max(int arr[]){
        int max =0;
        for(int e: arr){
            if(e>max){
                max=e;
            }
        }
        int min = max;
        System.out.println(max);
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);
        
    }
    public static void min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
            min =e;
            }
        }
        System.out.println(min);
    }
    public static void addArray(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static int unique(int arr[]){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        //Prime check
        // int n=3;
        // System.out.println(isprime(n));

        // // print prime
        // int n=10;
        // print(n);

        // fib
        // int n=10;
        // fib(n);

        // gcd & LCM
        // int a=15;
        // int b = 10;
        // System.out.println(gcd(a, b));
        // System.out.println("LCM is: "+(a*b/gcd(a, b)));

        // Palindrome
        // int n = 121;
        // System.out.println(pal(n));

        // Armstrong
        // int n = 152;
        // System.out.println(arm(n));

        // Take array from user
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Size of Array: ");
        // int n = sc.nextInt();
        // System.out.print("Enter Array: ");
        // int []arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array is: "+Arrays.toString(arr));
        // reverseArray(arr);

        // reverse array using shortcut method

        // Integer []arr = {1,2,3,4,5};
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println("Reversed array is: "+Arrays.toString(arr));

        // Find element in array
        // int arr[] = {1,2,3,4,5};
        // int find = 5;
        // int indexx = 0;
        // boolean a = false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == find){
        //         a = true;
        //         indexx = i;
        //     }
        // }
        // // System.out.println(a);
        // if(a){
        //     System.out.println("Present");
        //     System.out.println(indexx);
        // }
        // else{
        //     System.out.println("Absent");
        // }

        // print prime nos from array
        // int arr[] = {1,2,3,4,5,6,7,8};
        // for(int i=0;i<arr.length;i++){
        //     if(isprime(arr[i])){
        //         System.out.print(arr[i]+" ");
        //     }
        // }
        // System.out.println(b);

        // max element in array
        // int []arr = {22,1,2,33,4,5};
        // max(arr);
        // min(arr);

        // sort array using shortcut
        // int []arr = {22,1,88,44,33};
        // Arrays.sort(arr);
        // System.out.println("Sorted Array is: "+Arrays.toString(arr));

        // Add array
        // int []arr = {1,2,3,4,5};
        // addArray(arr);

        // Sort array
        // int []arr = {5,4,3,2,1};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.println("Sorted array is: "+Arrays.toString(arr));

        // Find duplicates from array
        int []arr = {1,2,2,3,4,4,5};
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.println(arr[i]);
        //             count++;
        //         }
        //     }
        // }
        // System.out.println("no of dup: "+count);
        System.out.println(unique(arr));
        int len = unique(arr);
        System.out.print("New Element is: [");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
            if(i<len-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
