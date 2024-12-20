import java.util.Scanner;
public class findNoOfDigits {

    static int countDigit(int n){
        int count =0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // int arr[] ={2,3,4,5,6,7};
        // System.out.print("Input: ");
        // for(int e: arr){
        //     System.out.print(e);
        //     // break;
        // }
        // System.out.println("\nOutput: "+arr.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int n=sc.nextInt();
        System.out.println(countDigit(n));

    }
}
