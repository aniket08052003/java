

import java.util.Scanner;



public class coditasStringPrac {

    public static Boolean endWithVowels(String str){
        char lastchar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastchar=='a' || lastchar=='e' || lastchar=='i' || lastchar == 'o' || lastchar == 'i';
    }

    public static Boolean startWithVowels(String str){
        char firstChar = Character.toLowerCase(str.charAt(0));
        return firstChar=='a' || firstChar=='e' || firstChar=='i' || firstChar == 'o' || firstChar=='u';
    }

    public static boolean ispal(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }


    // public static String longest(String str){
    //     String longg = "";
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i+1;j<=str.length();j++){
    //             String sub = str.substring(i,j);
    //             if(ispal(sub) && sub.length() > longg.length()){
    //                 longg = sub;
    //             }
    //         }
    //     }
    //     return longg;
    // }





    
    public static void main(String[] args) {

        //REVERSE WORD
        // String str="hello";
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }

        // UPPER TO LOWER
        // String str = "My Name Is Aniket";
        // String res = str.replace(" ","");
        StringBuilder sb = new StringBuilder();
        // for(int i=0;i<res.length();i++){
        //     char ch=res.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        //     else{
        //         sb.append(Character.toUpperCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // IF SPACE THEN NEW LINE
        // String str = "My Name Is Aniket";
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==' '){
        //         System.out.print("\n");
        //     }
        //     else{
        //         System.out.print(str.charAt(i));
        //     }
        // }


        // If letter start with vowel then go to new line
        // String str = "My Name Is Aniket";
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(Character.isUpperCase(ch=='a' || ch=='e'))
        // }

        Scanner sc = new Scanner(System.in);
        // TAKE WORDS ARRAY FROM USER
        // String []str = new String[2];
        // System.out.println("Enter 2 words: ");
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.nextLine();
        // }
        // for(int i=0;i<str.length;i++){

        //     System.out.println("Word "+(i+1)+" "+str[i]);
        // }

        // PRINT WORDS WHICH ENDS WITH VOWELS
        // String []str = {"Aniket","Mango","Apple"};
        // for(String st: str){
        //     if(endWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }

        // PRINT WORDS WHICH STARTS WITH VOWELS
        // String []str = {"Aniket","Mango","Apple"};
        // for(String st: str){
        //     if(startWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }

        // CHECK IF A WORD IS PALINDROME
        // String str = "ana";
        // String reverse ="";
        // for(int i=str.length()-1;i>=0;i--){
        //     reverse += str.charAt(i);
        // }
        // if(str.equals(reverse)){
        //     System.out.println("Pal");
        // }
        // else{
        //     System.out.println("Not");
        // }

        // CHECK IN WORDS ARRAY IF THERE IS PALINDROME
        // String str[] = {"ana" , "car","bnb"};
        // for(String st: str){
        //     if(ispal(st)){
        //         System.out.println(st);
        //     }
        // }

        //FIND LONGEST WORD
        // String []str = {"Aniket","Mango","Apple","Car"};
        // String longest = str[0];
        // for(String st: str){
        //     if(st.length() > longest.length()){
        //         longest = st;
        //     }
        // }
        // System.out.println(longest);
        // String small = longest;
        // for(String st: str){
        //     if(st.length()<small.length()){
        //         small=st;
        //     }
        // }
        // System.out.println("Smallest is: "+small);

        // FIND LONGEST PALINDROME SUBSTRING
        // String str = "banana";
        // System.out.println(longest(str));

        // FIND IF THE WORD IS OCCURED TWICE
        // String str = "This Is Pune. This is is Kop";
        // str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        // String []words = str.split("\\s+");
        // Arrays.sort(words);
        // System.out.print("Repeated Words are: ");
        // for(int i=1;i<words.length;i++){
        //     if(words[i].equals(words[i-1])){
        //         System.out.println(words[i]+" ");
        //     }
        // }

        // boolean []visited = new boolean[words.length];
        // for(int i=0;i<words.length;i++){
        //     if(!visited[i]){
        //         int count =1;
        //         for(int j=i+1;j<words.length;j++){
        //             if(words[i].equals(words[j])){
        //                 visited[j]=true;
        //                 count++;
        //             }
        //         }
        //         if(count>1){
        //             System.out.println(words[i]+": "+count);
        //         }
        //     }
        // }








    }
}
