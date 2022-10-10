// package Costumpackage;
package palindromepack;
public class Palindrom {
    public static String palindromee(String s)
    {
        int length = s.length();   
        String reverse = new String();
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + s.charAt(i);  
        if (s.equals(reverse))  
            return "Entered string/number is a palindrome.";  
        else  
            return "Entered string/number isn't a palindrome.";   
    }
}
