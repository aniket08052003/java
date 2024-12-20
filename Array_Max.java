
import java.util.Arrays;
import java.util.Scanner;

public class Array_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = {4,1,99,44,77};
        Arrays.sort(arr);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e > max){
                max = e;
            }
        }
        System.out.println("Max value is: "+max);
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e < min){
                min = e;
            }
        }
        System.out.println("Min value is: "+min);
    }
}
