import java.util.Scanner;
public class Lcm {

    static int lcm(int a, int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }

    static int gabrielGcd(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a != 0){
            return a;
        }
        else{
            return b;
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println((a*b)/gabrielGcd(a, b));
}
}
