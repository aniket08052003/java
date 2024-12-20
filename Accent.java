import java.util.Arrays;
import java.util.Scanner;
public class Accent {
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
    public static int gcd(int a,int b){
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
        }else{
            return b;
        }
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a, b);
    }
    public static int unique(int[] arr){
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
        Scanner sc = new Scanner(System.in);
        // String k = sc.next();
        // String c = sc.next();

        // int kcount=0;
        // int ccount=0;

        // for(int i=0;i<k.length();i++){
        //     char ch1 = k.charAt(i);
        //     char ch2 = c.charAt(i);

        //     if(ch1=='R' && ch2=='S' || ch1=='P' && ch2=='R' || ch1=='S'&& ch2=='P'){
        //         kcount++;
        //     }
        //     else{
        //         ccount++;
        //     }
        // }
        // if(kcount > ccount){
        //     System.out.print("Kylie");
        // }
        // else if(kcount == ccount){
        //     System.out.print("Draw");
        // }
        // else{
        //     System.out.print("Charlie");
        // }

        // int[] carplates = {1234,5678,9012,3456,7891};
        // int date = 15;
        // int fineamount = 250;
        // int finedCars = 0;

        // boolean isDateEven = date %2 ==0;
        // for(int plate: carplates){
        //     boolean isPlateEven = plate %2==0;
        //     if(isDateEven && !isPlateEven || !isDateEven && isPlateEven){
        //         finedCars++;
        //     }

        // }
        // int totalFine = finedCars * fineamount;
        // System.out.println("No of fined cars are: "+finedCars);
        // System.out.println(("Total fine is: "+totalFine));

        // System.out.print("enter size of array: ");
        // int n=sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter "+n+" numbers: ");
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        // int primecount=0;
        // int compcount=0;
        // int prime=0;
        // int comp=0;

        // for(int e: arr){
        //     if(isprime(e)){
        //         primecount++;
        //         prime = e;
        //     }
        //     else{
        //         compcount++;
        //         comp = e;
        //     }
        // }
        // if(primecount==4 && compcount==1){
        //     System.out.println(comp);
        // }
        // else if(compcount==4 && primecount==1){
        //     System.out.println(prime);
        // }

        // System.out.print("enter size of array: ");
        // int n=sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter "+n+" numbers: ");
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }


        // for(int i=0;i<n;i++){
        //     int currentLcm = arr[i];
        //     System.out.print(currentLcm+" ");

        //     for(int j=i+1;j<n;j++){
        //         currentLcm=lcm(currentLcm,arr[j]);
        //         System.out.print(currentLcm+" ");
        //     }
        // }

        // int count=0;
        // for(int e: arr){
        //     String str = Integer.toBinaryString(e);
        //     if(str.contains("1")){
        //         count++;
        //         System.out.println(e);
        //     }
        // }
        // System.out.println(count);

        // int[] arr={1,2,3,1,2,3,4,4};
        // System.out.println(unique(arr));
        // int len = unique(arr);
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print("");
        //     }
        //     for(int k=1;k<=(2*i-1);k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int n=5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print("");
        //     }
        //     for(int k=1;k<=(2*i-1);k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        

    }
}
