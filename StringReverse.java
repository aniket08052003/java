public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str.toString();
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+sb);
    }
}
