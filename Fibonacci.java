public class Fibonacci {

    static void fib(int n){
        int first = 0;
        int second = 1;
        if ( n < 0){
            System.out.println("Error");
        }
        if(n <= 1){
            System.out.println(first + " ");
        }
        if(n <= 2){
            System.out.println(second + " ");
        }
        for(int i =3 ; i < n ; i++){
            int next = first + second;
            System.out.println(next + " ");
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        int n =10;
        fib(n);
    }
}
