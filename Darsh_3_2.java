// package Practicle_file;


import java.util.Scanner;
import java.util.Vector;

//interface IPrinter 

interface IPrinter {

    // method for just making the default method small
    private void tell(String s) {
        System.out.println("Name : " + s);
    }

    // default method for printing the name
    default void tellCollege(String t) {
        tell(t);
    }
}

// interface IScanner
interface IScanner {
    java.util.Scanner s = new Scanner(System.in);

    // default method for asking the name
    default String ask() {
        System.out.println("Enter your name : ");
        return s.next();
    }
}

class concrete implements IPrinter, IScanner {
    String u;

    void useIPrinter() {
        tellCollege(u);
    }

    void useIScanner() {
        u = ask();
    }
}

public class Darsh_3_2 {
    public static void main(String[] args) {

        // vector declaration for storing the objects
        Vector<concrete> v1 = new Vector<>();
        for (int i = 0; i < 5; i++) {
            concrete c = new concrete();
            c.useIScanner();
            v1.add(c);
        }

        // for each loop to print the names
        for (concrete x : v1) {
            x.useIPrinter();
        }
        System.out.println("This code is prepared by 21CS055_Yashu Ranparia");
    }
}
