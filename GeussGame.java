import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int noOfGeuss=0;
    int userNumber;

    // public void end(){
    //     switch () {
    //         case 1: System.out.println("choose 1 to play game again");
                
    //             break;
    //         case 2: System.out.println("choose 2 to end the game");
    //             break;
    //         default:
    //             throw new AssertionError();
    //     }
    // }

    public void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Geuss the number: ");
        userNumber = sc.nextInt();
    }

    game(){
        Random r = new Random();
        number = r.nextInt(100);
    }

    public void setNoOfGeuss(int n){
        noOfGeuss = n;
    }

    public int getNoOfGeuss(){
        return noOfGeuss;
    }

    boolean isCorrect(){
        noOfGeuss++;
        if(userNumber == number){
            System.out.format("You geussed the correct number %d in %d attempts",number,noOfGeuss);
        }else if(userNumber > number){
            System.out.println("number is greater..");
        }else{
            System.out.println("number is low..");
        }
        return false;
    }
}


public class GeussGame{
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeInput();
            g.isCorrect();
        }
        
    }
}







// import java.util.Random;
// import java.util.Scanner;

// class game{
//     int number;
//     int noOfGeuss =0;
//     int userNumber;

//     public void takeInput(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Geuss the number: ");
//         userNumber = sc.nextInt();
//     }
//     game(){
//         Random r = new Random();
//         number = r.nextInt(100);
//     }
//     public void setNoOfGeuss(int n){
//         noOfGeuss = n;
//     }
//     public int getNoOfGeuss(){
//         return noOfGeuss;
//     }
//     boolean isCorrect(){
//         noOfGeuss++;
//         if(userNumber == number){
//             System.out.format("You geussed the correct no %d in %d geusses.",number , noOfGeuss);
//         }
//         else if(userNumber > number){

//             System.out.println("Too high..");
//         }else if(userNumber < number){
//             System.out.println("Too low..");
//         }
//         return false;
//     }
// }

// public class GeussGame {
//     public static void main(String[] args) {
//         game g = new game();
//         boolean b = false;
//         while(!b){
//             // System.out.println(g.takeInput());
//             g.takeInput();
//             g.isCorrect();

//         }
//     }
// }
