
public class coditasStringg {
    public static boolean endsWithVowels(String str){
        char lastChar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u';
    }
    public static boolean pal(String str){
        String st = "";
        for(int i=str.length()-1;i>=0;i--){
            st += str.charAt(i);
        }
        return str.equals(st);
    }
    // public static boolean isPal(String str){
    //     int left =0;
    //     int right = str.length()-1;
    //     while(left < right){
    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
    // public static String longestPalindrome(String str){
    //     String longest ="";
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i+1;j<=str.length();j++){
    //             String sub = str.substring(i,j);
    //             if(isPal(sub) && sub.length() > longest.length()){
    //                 longest = sub;
    //             }
    //         }
    //     }
    //     return longest;
    // }
    public static boolean ispal(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String longestPalindrome(String str){
        String longest ="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                if(ispal(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
    //     String []arr = {"Mango" , "Apple" , "Aniket","Car"};
    //     for(String str: arr){
    //         if(!endsWithVowels(str)){
    //             System.out.println(str);
    //         }
    //     }
    // }

    // reverse array
    // String []str = {"Mango" , "Apple" , "Aniket","Car"};
    // for(int i=str.length-1;i>=0;i--){
    //     System.out.print(str[i]+" ");
    // }
    // Scanner sc = new Scanner(System.in);
    // String[] words = new String[5];
    // System.out.print("Enter 5 words: ");
    // for(int i=0;i<words.length;i++){
    //     words[i] = sc.nextLine();
    // }
    // for(int i=0;i<words.length;i++){
    //     System.out.println(words[i]);
    // }

    // find longest word
    // String []str = {"Mango" , "Apple" , "Aniket","Car"};
    // String longg = str[0];
    // for(String st: str){
    //     if(st.length() > longg.length()){
    //         longg=st;
    //     }
    // }
    // System.out.println(longg);
    // String small = longg;
    // for(String stt: str){
    //     if(stt.length()<small.length()){
    //         small = stt;
    //     }
    // }
    // System.out.println("Smallest: "+small);

    // Palindrome
    // String str = "ana";
    // String st = "";
    // for(int i=str.length()-1;i>=0;i--){
    //     st += str.charAt(i);
    // }
    // if(str.equals(st)){
    //     System.out.println("Palindrome");
    // }
    // else{
    //     System.out.println("No");
    // }

    // check if there is any palindrome in the array
    // String str[] = {"banana","ana","car","bnb"};
    // for(String st: str){
    //     if(pal(st)){
    //         System.out.println(st);
    //     }
    // }

    // Find longest substring palindrome from string
        // String str = "banana";
        // System.out.println(longestPalindrome(str));


}
}
