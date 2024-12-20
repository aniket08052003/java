import java.util.Scanner;
public class practice{

    public static int gcd(int a , int b){
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

    public static void prime()  {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //GCD
        // System.out.println("Enter 1st no: ");
        // int a = sc.nextInt();
        // System.out.println("Enter 2nd no: ");
        // int b = sc.nextInt();
        // System.out.println("Gcd is: "+gcd(a, b));
        // LCM
        // System.out.println("LCM is: "+(a*b/gcd(a, b)));
        // print Array
        // System.out.print("Enter size of array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter Array: ");
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // check no is prime or not
        System.out.println();
    }
}