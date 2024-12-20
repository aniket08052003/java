
import java.util.Arrays;
import java.util.Scanner;





public class coditasString {
    public static boolean endsWithVowels(String str){
        char lastchar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastchar == 'a' || lastchar=='e' || lastchar=='i' || lastchar=='o' || lastchar=='u';
    }

    public static boolean startsWithVowels(String str){
        char firstchar = Character.toLowerCase(str.charAt(0));
        return firstchar=='a' || firstchar=='e' || firstchar=='i' || firstchar=='o' || firstchar=='u';
    }

    public static boolean pal(String str){
        String neww="";
        for(int i=str.length()-1;i>=0;i--){
            neww += str.charAt(i);
        }
        return str.equals(neww);
    }
    public static boolean ispal(String str){
        int left=0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String longest(String str){
        String longg = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                if(ispal(sub) && sub.length() > longg.length()){
                    longg = sub;
                }
            }
        }
        return longg;
    }
    public static void main(String[] args) {
        // String str = "hello";
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        // remove space and upper to lower and lower to upper
        // String str = "My Name Is Aniket";
        // StringBuilder sb = new StringBuilder();
        // String result = str.replace(" ","");
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isLowerCase(ch)){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // When uppercase then go to new line
        // String str = "My Name Is Aniket";
        StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append("\n");
        //     }
        //     sb.append(ch);
        // }
        // System.out.print(sb.toString());

        // take words array from user
        Scanner sc = new Scanner(System.in);
        // String []words = new String[5];
        // System.out.println("Enter 5 words: ");
        // for(int i=0;i<words.length;i++){
        //     words[i] = sc.nextLine();
        // }

        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // }

        // print words which ends with vowels
        // String []str = {"Mango","Apple","Aniket","Car"};
        // for(String st: str){
        //     if(endsWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }

        
        // print words which starts with vowels
        // String []str = {"Mango","Apple","Aniket","Ear"};
        // for(String st: str){
        //     if(startsWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }

        // check if word is palindrome
        // String str = "ana";
        // String neww ="";
        // for(int i=str.length()-1;i>=0;i--){
        //     neww += str.charAt(i);
        // }
        // if(str.equals(neww)){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // check from word of arrays , if there is palindrome
        // String []str = {"anana" , "aniket","bnb"};
        // for(String st: str){
        //     if(pal(st)){
        //         System.out.println(st);
        //     }
        // }

        // Find longest substring banana
        // String str = "banana";
        // System.out.println(longest(str));

        // Find longest word from array
        // String []str = {"Mango","Apple","Aniket","Ear"};
        // String longest = str[0];
        // for(String st: str){
        //     if(st.length() > longest.length()){
        //         longest = st;
        //     }
        // }
        // System.out.println("Longest word: "+longest);
        // String small = longest;
        // for(String st: str){
        //     if(st.length() < small.length()){
        //         small = st;
        //     }
        // }
        // System.out.println("Smallest word: "+small);

        //Print the word which is appeared more than 1 times
        String str = "This is Aniket. This is car";
        str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
        String []words = str.split("\\s+");
        Arrays.sort(words);
        System.out.println("Repeated words are: ");
        for(int i=1;i<words.length;i++){
            if(words[i].equals(words[i-1])){
                System.out.println(words[i]);
                while(i<words.length-1 && words[i].equals(words[i+1])){
                    i++;
                }
            }
        }

        


    }
}
