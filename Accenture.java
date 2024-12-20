import java.util.Arrays;
import java.util.Scanner;

class Accenture{
    public static int gcd(int a , int b){
        while(a !=0 && b!= 0){
            if(a>b){
                a=a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a!=0){
            return a;
        }
        else{
            return b;
        }
    }

    public static void fib(int n){
        int first = 0;
        int second = 1;
        for(int i=2;i<n;i++){
            if(i==0){
                System.out.println(first+" ");
            }
            if(i==1){
                System.out.println(second+" ");
            }
            int next = first + second;
            System.out.println(next+" ");
            first = second;
            second = next;
        }
    }

    public static boolean pal(int n){
        int num = n;
        int remainder;
        int reversenum=0;
        while(n!=0){
            remainder = n%10;
            reversenum = reversenum * 10 + remainder;
            n /= 10;
        }
        return num == reversenum;
    }

    public static boolean armstrom(int n){
        int num =n;
        int noOfDigit = String.valueOf(n).length();
        int sum =0;
        while(n!=0){
            int digit = n%10;
            sum += Math.pow(digit, noOfDigit);
            n /= 10;
        }
        return sum==num;
    }

    public static boolean checkPrime(int n){
        if(n == 1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    
    public static void printPrime(int n){
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

    public static void reverseArray(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        System.out.println("Reversed Array is: "+Arrays.toString(arr));
    }

    public static int arrayMax(int arr[]){
        // int max =0;
        // for(int e: arr){
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // return max;
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int secondMax = arr[arr.length-2];
        // return secondMax;
        return max;
    }

    public static int arrayMin(int arr[]){
        // int min = Integer.MAX_VALUE;
        // for(int e: arr){
        //     if(e<min){
        //         min = e;
        //     }
        // }
        // return min;
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[arr.length-n];
        return min;
    }

    public static int addArray(int arr[]){
        int sum =0;
        for(int e: arr){
            sum += e;
        }
        return sum;
    }

    public static void reverse(int[] arr , int start , int end){
        // start = 0;
        // end = arr.length;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr , int k){
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }
    public static void rotate1(int[] arr , int k){
        k = k% arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static boolean xyz(int n){
        int num =n;
        int remainder;
        int reverseNum =0;
        while(n!=0){
            remainder = n%10;
            reverseNum = reverseNum * 10 + remainder;
            n /= 10;
        }
        return num == reverseNum;
    }

    public static boolean xy(String str){
        str = str.toLowerCase();
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        return str.equals(reverse);
    }
    public static int unique(int[] arr){
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[++j] = arr[i];
            }

        }
        return j+1;
    }
    public static int aniket(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count ==1){
                return arr[i];
            }
        }
        return -1;
    }

    public static int mac(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) GCD & LCM

        // System.out.println("Enter 1st no: ");
        // int a = sc.nextInt();
        // System.out.println("Enter 2nd no: ");
        // int b = sc.nextInt();
        // // System.out.println("GCD is: "+gcd(a, b)); 
        // System.out.println("LCM is: "+ a*b/gcd(a, b));


        // 2) Fibonacci series 

        // System.out.println("Enter no: ");
        // int n = sc.nextInt();
        // fib(n);

        // 3) Palindrome

        // System.out.println("Enter no: ");
        // int n = sc.nextInt();
        // System.out.println(pal(n));

        // 4) Armstrom

        // System.out.println("Enter no: ");
        // int n = sc.nextInt();
        // System.out.println(armstrom(n));

        // 5) Check Prime no
        
        // System.out.print("Enter no: ");
        // int n = sc.nextInt();
        // System.out.println(checkPrime(n));

        // 6) Print prime nos

        // System.out.println("Enter no: ");
        // int n = sc.nextInt();
        // printPrime(n);

        // 7) Reverse String
        // System.out.println("Enter String: ");
        // String str = sc.next();
        // StringBuilder sb = new StringBuilder(str);
        // // sb.reverse();
        // String result = sb.toString().toUpperCase();
        // // str.toString();
        // // System.out.println(sb);
        // System.out.println(result);

        // Arrays

        // 8) take array and display array

        // System.out.println("Enter size of Array: ");
        // int n = sc.nextInt();

        // System.out.println("Enter Array: ");
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Array is: "+Arrays.toString(arr));

        // 9) sort array

        // Arrays.sort(arr);
        // System.out.println("Sorted Array is: "+Arrays.toString(arr));


        // 10) Reverse Array
        // reverseArray(arr);

        // 11) find max element
        // System.out.println("Max element is: "+arrayMax(arr));

        // 12) find min element
        // System.out.println("Min element is: "+arrayMin(arr));

        // 13) Adding all elements in array
        // System.out.println("Addition is: "+addArray(arr));

        // 14) Rotate array by k positions to right
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate1(arr, k);

        // for(int e: arr){
        //     System.out.print(e+" ");
        // }

        //Strings

        // 15) count space in a string
        // String str = "My name is Aniket";
        // int count =0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         count += 1;
        //     }
        // }
        // System.out.println(count);

        // 16) make lowercase to uppercase
        // String str = "My name is Aniket";
        // StringBuilder sb = new StringBuilder();
        // for(int i =0; i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // 17) when UpperCase letter will occur , then go to newline
        // String str = "myNameIsAniket";
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append("\n");
        //     }

        //     sb.append(ch);
        // }
        // System.out.println(sb.toString());

        // 18) Todays code

        // String str = "myNameIsAniket";
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append("\n");
        //     }
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // 19) remove space from string
        // String str = "My name is Aniket";
        // String result = str.replace(" ","");
        // System.out.println(result);

        // 20) Count space from str1 and str2 , return their difference
        // String str1 = "my name is Aniket";
        // int count1 =0;
        // String str2 = "Hello Aniket";
        // int count2 =0;
        // for(int i=0;i<str1.length();i++){
        //     if(str1.charAt(i)==' '){
        //         count1++;
        //     }
        // }
        // for(int i=0;i<str2.length();i++){
        //     if(str2.charAt(i)==' '){
        //         count2++;
        //     }
        // }
        // int diff = count1 - count2;
        // System.out.println(diff);

        // int n = 121;
        // System.out.println(xyz(n));

        // 21) Check whether a string is palindrome or not

        // String str = "madam";
        // System.out.println(xy(str));

        // 22) return no of vowels from the string
        // String str = "abcdefghijklmnopqrstuvwxyz";
        // int count1=0;
        // int count2 = 0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        //         count1++;
        //     }
        //     else{
        //         count2++;
        //     }

        // }
        // System.out.print("Vowels are: "+count1);
        // System.out.print("Consonants are: "+count2);

        // 23) count no of occurence of integer in a string

        // String str = "abcd1efg3fjf6fh";
        // int count =0;
        // for(int i=0;i<str.length();i++){

        //     if(Character.isDigit(str.charAt(i))){
        //         count++;
        //     }
        // }
        // System.out.println(count);


        // Practise

        // String str = "my1niffw3nfvbf4ih5hh";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(Character.isDigit(str.charAt(i))){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        // String str = "My Name Is Aniket";
        // int count = 0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         count ++;
        //     }
        // }
        // System.out.println(count);
        // str = str.replace(" ","");
        // System.out.println(str);
        // StringBuilder sb = new StringBuilder();
        // for(int i=0; i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(str.charAt(i)==' '){
        //         sb.append("\n");
        //     }
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // Remove unique elements from array
        // System.out.print("Enter size of Array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.print("Enter Array: ");
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(unique(arr));

        // int len = unique(arr);
        // System.out.print("New Element is: [");
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]);
        //     if(i<len-1){
        //         System.out.print(", ");
        //     }
        // }
        // System.out.print("]");
        // System.out.println("Array is: "+Arrays.toString(arr));

        // Aray = {1,1,2,3,3,4,4} , print 2

        // int[] arr = {1,1,2,2,3,3};
        // System.out.println(aniket(arr));

        // String str = "madam";
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // String reverse = sb.toString();
        // System.out.println(reverse);
        // System.out.println(str);
        // if(reverse.equals(str)){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }


        // with repetition
        // String str = "ababababab";
        // int count = 0; 
        // for (int i = 0; i <= str.length() - 3; i++) { 
        //     if (str.substring(i, i + 3).equals("aba")) { 
        //         count++; 
        //     }
        // }
        // System.out.println(count);
         

        // non-repetition , print occurence of aba
        // String str = "ababababab";
        // int index =0;
        // int count=0;
        // while(index <= str.length()-3){
        //     index = str.indexOf("aba",index);
        //     if(index != -1){
        //         count++;
        //         index += 3;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(count);



        // String str = "fndj3njs4njsf4nj";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(Character.isDigit(str.charAt(i))){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // int arr[] = {1,1,2,2,3,3,4};
        // System.out.println(mac(arr));

        // int arr[] = {1,2,3,3,2,1,4};
        // Arrays.sort(arr);
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[j]!=arr[i]){
        //         arr[++j]=arr[i];
        //     }
        // }
        // System.out.println(j+1);
        // int len = unique(arr);
        // System.out.print("[");
        // for(int i=0;i<len;i++){
        //     System.out.print(arr[i]);
        //     if(i<len-1){
        //         System.out.print(", ");
        //     }
        // }
        // System.out.print("]");
        

        // Sorting Array
        // int[] arr={5,4,3,2,1};
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(int e: arr){
        //     System.out.print(e);
        // }

        // decimal to binary
        // int n =45;
        // System.out.println(n);
        // String b = "";
        // while(n!=0){
        //     int x = n%2;
        //     b = x+b;
        //     n /= 2;
        // }
        // System.out.println(b);
        // char[] arr = b.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j] >= arr[j+1]){
        //             char temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for(char e: arr){
        //     System.out.print(e);
        // }


        // binary to decimal
        // String b = "101101";
        // int decimal =0;
        // int powOf = 1;
        // for(int i=b.length()-1;i>=0;i--){
        //     if(b.charAt(i)=='1'){
        //         decimal += powOf;
        //     }
        //     powOf *= 2;
        // }
        // System.out.println(decimal);

        





// String b = "racecar";
// String a="";
// // a = b[::-1]
// // char[] arr = b.toCharArray();
// for(int i=b.length()-1;i>=0;i--){
//     // System.out.print(b.charAt(i));
//     a += b.charAt(i); 
// }
// System.out.println(b);
// System.out.println(a);
// if(b.equals(a)){
//     System.out.print("true");
// }
// else{
//     System.out.print("false");
// }

// int n=20;
// int sum=0;
// for(int i=0;i<=n;i++){
// sum += i;
// }
// System.out.println(sum);







    }
}