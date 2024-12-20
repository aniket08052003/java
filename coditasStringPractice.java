
import java.util.Arrays;
import java.util.Scanner;

public class coditasStringPractice{

    public static boolean endsWithVowels(String str){
        char lastchar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastchar=='a' || lastchar=='e' || lastchar=='i' || lastchar=='o' || lastchar=='u';
    }

    public static boolean ispal(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static String longest(String str){
        String longg="";
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
        Scanner sc = new Scanner(System.in);

        // String []str = new String[2];
        // System.out.println("Enter 2 words: ");
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.nextLine();
        // } 
        // for(String st: str){
        //     System.out.println(st);
        // }

        // String str[] = {"Aniket","Apple","Mango"};
        // for(String st: str){
        //     if(endsWithVowels(st)){
        //         System.out.println(st);
        //     }
        // }

        // String []str = {"Aniket","ana","bnb","car"};
        // // System.out.println(ispal(str));
        // for(String st: str){
        //     if(ispal(st)){
        //         System.out.println(st);
        //     }
        // }

        // String []str = {"Aniket","ana","bnb","car"};
        // String longg ="";
        // for(String st: str){
        //     if(st.length() > longg.length()){
        //         longg=st;
        //     }
        // }
        // System.out.println(longg);

        // String str="banana";
        // System.out.println(longest(str));

        String str = "This is Aniket. This is is Pune.";
        str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        String []words = str.split("\\s+");
        Arrays.sort(words);
        System.out.println("Repeated Words are: ");
        // for(int i=1;i<words.length;i++){
        //     if(words[i].equals(words[i-1])){
        //         System.out.println(words[i]+" ");
        //     }
        // }

        boolean []visited = new boolean[words.length];
        for(int i=0;i<words.length;i++){
            if(!visited[i]){
                int count=1;
                for(int j=i+1;j<words.length;j++){
                    if(words[i].equals(words[j])){
                        visited[j]=true;
                        count++;
                    }
                }
                // if(count>1){
                    System.out.println(words[i]+": "+count);
                // }
            }
        }





    }
}
