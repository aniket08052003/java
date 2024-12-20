import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_Practice {
    /* 1. Find Max Element from the Array */ 
    static int max(int arr[]){

        int max=0;
        for(int e: arr){
            if(e > max){
                max=e;
            }
        }
        return max;
    }
    /* 2. Find Min Element from the Array */ 
    static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(min > e){
                min = e;
            }
        }
        return min;
    }
    /* 3. Find 2nd Largest Element from the Array */ 
    static int SecondMax(int arr[]){

        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    /* 4. Descending Order of Array */ 
    static void Descending(int arr[]){
        Integer[] newarr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(newarr , Collections.reverseOrder());
        System.out.println("Descending Array is: "+Arrays.toString(newarr));
    }
    /* 5. Adding all elements of Array */ 
    static int addArray(int arr[]){
        int sum =0;
        for(int e: arr){
            sum += e;
        }
        return sum;
    }
    /* 6. Reverse Array-1 */ 
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array is: "+Arrays.toString(arr));
    }
    /* 6. Reverse Array-2 */ 
    static void reverse(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed Array is: "+Arrays.toString(arr));
    }
    /* 7. Print No of Unique elements in Array */ 
    static int uniqueElement(int[] arr){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
    /* 8. Find max product of 2 elements in Array */ 
    static int product(int arr[]){
        Arrays.sort(arr);
        int num1 =arr[arr.length-1];
        int num2=arr[arr.length-2];
        int pro = num1*num2;
        return pro;
    }
    /* 9. Fibonacci Series*/ 
    static void fib(int n){
        int first = 0;
        int second =1;
        if(n<=0){
            System.out.println("Invalid");
        }
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(first+" ");
            }
            if(i==2){
                System.out.println(second+" ");
            }
            int next = first + second;
            first = second;
            second = next;
            System.out.println(next+" ");

        }
    }
    /* 10. Find pair of no*/ 
    static void pair(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j==n){
                    System.out.println(i+","+j);
                }
            }
        }
    }

/* 11. Find pair of no*/ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        // if(n < 2){
        //     System.out.println("Enter More than 2 Elements");
        // }
        int[] arr=new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("User's Array is: "+Arrays.toString(arr));
        // int m = max(arr);
        // System.out.println("Max Element in Array is: "+m);
        // int mi = min(arr);
        // System.out.println("Min Element in Array is: "+mi);
        // System.out.println("2nd Largest Element in Array is: "+SecondMax(arr));
        // Descending(arr);
        // Integer[] newarr = new Integer[n];
        // System.out.println("Enter New Array");
        // for(int i=0;i<n;i++){
        //     newarr[i] = sc.nextInt();
        // }
        // Arrays.sort(newarr, Collections.reverseOrder());
        // System.out.println("Descending Array is: " + Arrays.toString(newarr));
        // System.out.println("Addition of All Elements in Array is: "+addArray(arr));
        // reverse(arr);
        /*         System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("User's Array is: "+Arrays.toString(arr));
        reverse(arr); */
        // Find unique elements in array
        System.out.println("Unique elements in Array is: "+uniqueElement(arr));
        int length = uniqueElement(arr);
        System.out.print("New Array is: [");
        for(int i=0; i<length;i++){
            System.out.print(arr[i]);
            if(i < length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // System.out.println("Product is: "+product(arr));
        // fib(n);
        // pair(n);










    }
}
