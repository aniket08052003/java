
import java.util.Arrays;

public class coditasArray {
    public static void add(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Addtion: "+sum);
    }

    public static void reverse(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array is: "+Arrays.toString(arr));
    }
    public static void max(int arr[]){
        int max=0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("Max is: "+max);
    }
    public static void min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min =e;
            }
        }
        System.out.println("Min element is: "+min);
    }

    public static void unique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static int unique1(int arr[]){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
    public static void reverse1(int arr[],int start , int end){
        // start =0;
        // end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // System.out.println("Reverse Array is: "+Arrays.toString(arr));
    }
    public static void rotate(int[] arr , int k){
        k = k%arr.length;
        reverse1(arr,0,arr.length-1);
        reverse1(arr,0,k-1);
        reverse1(arr,k,arr.length-1);

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,3,4,5,2,6};
        // add(arr);
        // reverse(arr);
        // Integer arr[] = {1,2,3,4,5};
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println(Arrays.toString(arr));
        // max(arr);
        // min(arr);
        unique(arr);
        // System.out.println(unique1(arr));
        int len = unique1(arr);
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+ " ");
        }

        // find element is present or not
        // int arr[] = {1,2,3,4,5};
        // int target = 43;
        // boolean b=false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         b= true;
        //     }
        // }
        // if(b){
        //     System.out.println("Present");
        // }
        // {
        //     System.out.println("Absent");
        // }

        // sort Array
        // int arr[] = {5,4,3,2,1};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));


        // Rotate Array
        // int[] arr = {1,2,3,4,5,6,7};
        // int k = 3;
        // rotate(arr, k);
        // for(int e: arr){
        //     System.out.print(e+" ");
        // }
    }
}
