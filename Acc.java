import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Acc {
    public static boolean isprime(int n){
        if(n == 1){
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
    public static void printprime(int n){
        boolean[] prime = new boolean[n+1];
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
        }
        else{
            return b;
        }
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static boolean pal(int n){
        int remainder;
        int num =n;
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
        int len = String.valueOf(n).length();
        int sum =0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit,len);
            n /= 10;
        }
        return sum == num;

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
    public static void reverse(int arr[] , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate1(int arr[],int k){
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
    }
    public static void rotate2(int arr[],int k){
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static boolean paran(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            // char ch2 = str.toCharArray();

            if(ch1 == '(' || ch1 == '{' || ch1 == '['){
                stack.push(ch1);
            }
            else if(ch1 == ')' || ch1 == '}' || ch1 == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch1==')' && top != '(' || ch1=='}' && top !='{' || ch1==']' && top != '['){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void shortString(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'b' || ch =='a'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    System.out.println("False");
                }
                char top = stack.pop();
                if(ch=='a' && top != 'b' || ch=='b' && top != 'a'){
                    stack.pop();
                }
            }
        }
        System.out.println(str);

        // char[] result = new char[str.length()];
        // int pos = 0; // Position in the result array

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     // If pos > 0 and the last character matches, "remove" it by moving back
        //     if (pos > 0 && result[pos - 1] == ch) {
        //         pos--; // Remove the last character
        //     } else {
        //         result[pos] = ch; // Otherwise, add the current character
        //         pos++; // Move to the next position
        //     }
        // }

        // Convert result to a string, using only the valid portion up to `pos`
        // System.out.println(new String(result, 0, pos));
    }
    public static void deci(String str){
        int powof = 1;
        int decimal =0;
        // int i;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                decimal += powof;
            }
            powof *= 2;
        }
        System.out.println(decimal);
        System.out.println(powof);
    }

    public static void exam(int n){
        int x =2;
        int powof = 0;
        if(n==1){
            powof = 0;
        }
        else{

            int digit =1;
            int res=0;
            while(res != n){
                res = digit * x;
                digit *= 2;
                powof++;
            }
        }
        System.out.println(powof);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int sum=0;
        // int round =5;
        // for(int i=0;i<round;i++){

        //     System.out.println("Round "+(i+1)+": Choose from 0=Stone , 1=Paper , 2=Scissor");
        //     int userInput = sc.nextInt();
        //     Random rand = new Random();
        //     int compInput = rand.nextInt(3);
        //     if(userInput < 0 || userInput >2){
        //         System.out.println("Invalid input");
        //         i--;
        //         continue;
        //     }
        //     if(userInput == compInput){
        //         System.out.println("Draw");
        //     }
        //     else if(userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1){
        //         System.out.println("You wins");
        //         sum++;
        //     }
        //     else{
        //         System.out.println("Computer wins");
        //     }
        //     System.out.println("Computer has choosed: "+compInput);

        // }
        // System.out.println("Game over, you win by "+sum+" chances out of "+round);

        // check prime
        // System.out.print("Enter 1st no: ");
        // int a = sc.nextInt();
        // System.out.print("Enter 2nd no: ");
        // int b = sc.nextInt();
        // System.out.println(gcd(a, b));
        // System.out.print("LCM is: "+a*b/gcd(a, b));

        // System.out.println(isprime(n));
        // printprime(n);

        // System.out.print("Enter no: ");
        // int n= sc.nextInt();
        // // System.out.println(pal(n));
        // System.out.println(arm(n));
        
        // System.out.print("Enter size of Array: ");
        // int n= sc.nextInt();
        // System.out.println("Enter Arr: ");
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // int arr[] = {100,100,100,100,100};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
        // // int max = arr[arr.length-arr.length];
        // // System.out.println(max);
        // int sum=1;
        // for(int i=0;i<arr.length;i++){
        //     sum *= arr[i];
        // }
        // System.out.println(sum);

        // int[] arr = {1,3,4,5};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        // int n = arr.length+1;
        // // System.out.println(n);
        // int res = n*(n+1)/2;
        // // System.out.println(res);
        // int miss = res - sum;
        // System.out.println(miss);

        // int arr[] = {1,2,3,4,5,6,7};
        // // Arrays.sort(arr);
        // System.out.println(unique(arr));
        // int len = unique(arr);
        // for(int i=0;i<len;i++){
        //     System.out.println(arr[i]);
        // }
        // int arr[] = {1,2,3,4,5,6,7};
        // int k=3;
        // rotate1(arr, k);
        // for(int e: arr){
        //     System.out.print(e+" ");
        // }
        // System.out.println();
        // rotate2(arr, k);
        // for(int el: arr){
        //     System.out.print(el+" ");
        // }

        // String str = "racecar";
        // String b="";
        // for(int i=str.length()-1;i>=0;i--){
        //     b += str.charAt(i);
        // }
        // System.out.println(b);

        StringBuilder sb = new StringBuilder();
        // sb.reverse();
        // String rev = sb.toString();
        // System.out.println(rev);
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append("\n");
        //     }
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String result = str.replace(" ","");
        // System.out.println(result);
        // String rev ="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev += str.charAt(i);
        // }
        // // System.out.println(rev);
        // if(str.equals(rev)){
        //     System.out.println("true");
        // }else{
        //     System.out.println("False");
        // }

        // without repitition
        // String str ="ababababab";
        // int index=0;
        // int count=0;
        // for(int i=0;i<str.length()-3;i++){
        //     index=str.indexOf("aba",index);
        //     if(index != -1){
        //         count++;
        //         index += 3;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(count);

        // int count=0;
        // for(int i=0;i<str.length()-3;i++){
        //     if(str.substring(i,i+3).equals("aba")){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // String b="";

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='a'){
        //         b += 'b';
        //     }
        //     else if(str.charAt(i)=='b'){
        //         b+= 'a';
        //     }

        // }
        // System.out.println(b);

        // int n =45;
        // String b="";
        // while(n!=0){
        //     int x = n%2;
        //     b = x +b;
        //     n /= 2;
        // }
        // System.out.println(b);
         
        // String a = b;
        // int digit =0;
        // int powof = 1;
        // for(int i=a.length()-1;i>=0;i--){
        //     if(a.charAt(i)=='1'){
        //         digit += powof;
        //     }
        //     powof *= 2;
        // }
        // System.out.println(digit);
        // int round=5;
        // int usercount=0;
        // int compcount=0;
        // System.out.println("Choose from 0=stone , 1=paper, 2=scissor");



        // String k = sc.next();
        // String c = sc.next();

        // int kcount=0;
        // int ccount=0;
        // for(int i=0;i<k.length();i++){
            
        //     char ch1 = k.charAt(i);
        //     char ch2 = c.charAt(i);
    
        //     if(ch1=='R' && ch2=='S' || ch1 == 'P' && ch2 == 'R' || ch1=='S'&& ch2=='P'){
        //         kcount++;
        //     }
        //     else{
        //         ccount++;
        //     }
        // }
        // if(kcount > ccount){
        //     System.out.println("Kylie");
        // }
        // else{
        //     System.out.println("Charlie");
        // }


        // int[] carplates = {1234, 5678, 9012, 3456, 7891};

        // int date =15;
        // int fineamt=250;
        // int totalFinedCars=0;

        // boolean isDateEven = (date % 2==0);
        // for(int plate: carplates){
        //     boolean isPlateEven = (plate % 2 ==0);

        //     if(isDateEven && !isPlateEven || isPlateEven && !isDateEven){
        //         totalFinedCars++;
        //     }
        // }
        // int totalFine = totalFinedCars * fineamt;
        // System.out.println("Total cars fined: "+totalFinedCars);
        // System.out.println("Fined Amount is: "+totalFine);

        // prime-composite
        // int[] arr=new int[5];
        // System.out.print("Enter 5 Nos: ");
        // for(int i=0;i<5;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int primeCount = 0;
        // int compCount=0;
        // int prime=0;
        // int comp=0;
        // for(int e: arr){
        //     if(isprime(e)){
        //         primeCount++;
        //         prime =e;
        //     }
        //     else{
        //         compCount++;
        //         comp=e;
        //     }
        // }
        // if(primeCount==4 && compCount==1){
        //     System.out.println(comp);
        // }
        // else if(compCount==4 && primeCount==1){
        //     System.out.println(prime);
        // }

        // LCM of SubArray
        // System.out.print("Choose size of Array: ");
        // int n=sc.nextInt();
        // int[] arr = new int[n];
        // System.out.println("Enter "+n+" Numbers: ");
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<n;i++){
        //     int currentLCM = arr[i];
        //     System.out.print(currentLCM+" ");

        //     for(int j=i+1;j<n;j++){
        //         currentLCM = lcm(currentLCM,arr[j]);
        //         System.out.print(currentLCM+" ");
        //     }
        // }

        //question : array = {0,1,2} , convert elements of this array in binary and if the element of binary form contains "1" then increment count++ , return count
        // int[] arr = {0,1,2};
        // int count =0;
        // for(int e: arr){
        //     String str = Integer.toBinaryString(e);
        //     if(str.contains("1")){
        //         count++;
        //         System.out.println(e);
        //     }
        // }
        // System.out.println("The count is: "+count);


        // String str = "(a){b}";
        String str ="baabc";
        // System.out.println(paran(str));
        shortString(str);

        // String str = "10000";
        // deci(str);
        // int n = 64;
        // exam(n);
























    }
}
