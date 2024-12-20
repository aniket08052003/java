public class coditasRotate {
    public static void reverse(int arr[] , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[] , int k){
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k=3;
        rotate(arr, k);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
