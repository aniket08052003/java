import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class Accenture1 {
    public static boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c =='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c ==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c==')' && top!='(') && (c=='}' && top!='{') && (c==']' && top!='[')){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
public static void main(String[] args) {
    // String s ="{nds(nwf)}";
    // Accenture1 v = new Accenture1();
    // System.out.println(v.valid(s));


    // Switch case

    Scanner sc = new Scanner(System.in);
    // System.out.println("Choose no bet 1-7: ");
    // int n = sc.nextInt();

    // String day;

    // switch(n){
    //     case 1: 
    //     day = "monday";
    //     break;
    //     case 2: 
    //     day = "tuesday";
    //     break;
    //     case 3: 
    //     day = "Wednesday";
    //     break;
    //     case 4: 
    //     day ="thursday";
    //     break;
    //     case 5:
    //     day = "friday";
    //     break;
    //     case 6:
    //     day = "saturday";
    //     break;
    //     case 7:
    //     day = "sunday";
    //     break;
    //     default:
    //     day = "invalid day no";
    //     break;

    // }
    // if(n>=8 || n==0){
    //     System.out.println("Choose no bet 1-7");
    // }else{

    //     System.out.println("Day is: "+day);
    // }
    // System.out.print("Enter 1st no: ");
    // int a = sc.nextInt();
    // System.out.print("Enter 2nd no: ");
    // int b = sc.nextInt();
    // System.out.print("Choose operator (+,-,/,*): ");
    // char op = sc.next().charAt(0);
    // double result;

    // switch(op){
    //     case '+':
    //     result = a+b;
    //     System.out.println(result);
    //     break;
    //     case '-':
    //     result = a-b;
    //     System.out.println(result);
    //     break;
    //     case '/':
    //     result = a/b;
    //     System.out.println(result);
    //     break;
    //     case '*':
    //     result = a*b;
    //     System.out.println(result);
    //     break;
    //     default :
    //     System.out.println("Choose operator between (+,-,/,*)");
    //     break;

    // }
    // int car[] = {1,2,3,4,5,6,7};
    System.out.println("Choose 0=rock , 1=paper , 2=scissor");
    int userInput = sc.nextInt();

    Random rand = new Random();
    int compInput = rand.nextInt(3);
    int sum =0;

    if(userInput == compInput){
        System.out.println("draw");
    }
    else if(userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1){
        System.out.println("You win");
        sum += 1;
    }
    else{
        System.out.println("Comp wins");
    }
    System.out.println("Computer has choosed: "+compInput);

    
    System.out.println(sum);







}




























    // public static boolean isvalid(String s){
    //     Stack<Character> stack = new Stack<>();
    //     for(char c: s.toCharArray()){
    //         if(c=='('||c=='{'||c=='['){
    //             stack.push(c);
    //         }
    //         else if(c==')'||c=='}'||c==']'){
    //             if(stack.isEmpty()){
    //                 return false;
    //             }
    //             char top = stack.pop();
    //             if((c==')' && top!='(') || (c=='}' && top != '{') || (c==']' && top!='[')){
    //                 return false;
    //             }
    //         }
    //     }
    //     return stack.isEmpty();
    // }
    // public static void main(String[] args) {
    //     // String s ="{(a-b)*(a/b)}";
    //     String s = "(a){b}";
    //     Accenture1 v = new Accenture1();
    //     System.out.println(v.isvalid(s));
    // }
}
