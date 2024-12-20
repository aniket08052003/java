import java.util.Arrays;
import java.util.Scanner;

public class coditasPracArray {
    public static int add(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void max(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);
    }

    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr[arr.length-arr.length]);
    }

    public static void unique(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
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

    public static void rev(int arr[] , int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[],int k){
        k=k%arr.length;
        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of Array: ");
        // int n = sc.nextInt();
        // System.out.println("Enter Array: ");
        // int []arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array is: "+Arrays.toString(arr));

        // add array
        // int []arr = {1,2,3,4,5};
        // System.out.println(add(arr));

        //MAX
        // int arr[] = {1,2,5,3,4};
        // max(arr);
        // min(arr);

        // REVERSE ARRAY USING SHORTCUT
        // Integer []arr = {1,2,3,4,5};
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println("Reversed Array is: "+Arrays.toString(arr));
        
        // REVER ARRAY
        // int arr[]={1,2,3,4,5};
        // reverse(arr);

        // SORT ARRAY USING SHORTCUT
        // int []arr = {3,1,6,5,8,7};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // SORT ARRAY 
        // int arr[] = {3,1,6,5,8,7};
        // sort(arr);

        //FIND UNIQUE ELEMENTS FROM ARRAY
        // int arr[] = {1,2,2,3,4,5,5};
        // unique(arr);
        // System.out.println(unique1(arr));

        // Remove unique elements from array
        // int arr[] = {1,2,2,3,4,5,5};
        // int len = unique1(arr);
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // FIND WHETHER ELEMENT IS PRESENT OR NOT
        // int arr[] = {1,2,3,4,5};
        // int target = 3;
        // boolean b = false;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         b = true;
        //     }
        // }
        // if(b){
        //     System.out.println("Present");
        // }
        // else{
        //     System.out.println("Absent");
        // }

        // ROTATE ARRAY
        // int arr[] = {1,2,3,4,5,6};
        // int k=3;
        // rotate(arr, k);
        // for(int e: arr){
        //     System.out.print(e+" ");
        // }

    }
}
