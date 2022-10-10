import java.util.*;
import palindromepack.Palindrom;
public class palindrome_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom p = new Palindrom();
        String s = new String();
        System.out.println("Enter the String to check Palindrome");
        s = sc.next();
        System.out.println(p.palindromee(s));
        System.out.println("This code is prepared by 21CE006 Aswani Darsh");
    }
}
