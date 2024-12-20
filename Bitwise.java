import java.util.Arrays;
public class Bitwise {
    static String DecimalTOBinary(int n){
        String b = "";
        while(n>=1){
            int x = n%2;
            n = n/2;
            b= x+b;
        }
        return b;
    }
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
    static int BinaryToDecimal(String b){
        int result = 0;
        int powof2 = 1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                result = result + powof2;
            }
            powof2 = powof2 * 2;
        }
        return result;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter No: ");
        // int n = sc.nextInt();
        // String result = DecimalTOBinary(n);
        // System.out.println(result);
        // System.out.println(BinaryToDecimal(result));
        int arr[] = {2,2,3,4,5,6};
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
    }
}
