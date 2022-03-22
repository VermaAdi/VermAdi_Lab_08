package Lab08.Part1;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Derived2 extends Derived {

    //Constructor
    public Derived2() {
        System.out.println("Derived2 Constructor");
    }

    /**
     * m2 method for Derived2
     *
     * @param s ; String appended in the print statement
     */
    public void m2(String s) {
        System.out.println(s + " from Derived2");
    }

    /**
     * m4 method for Derived2
     */
    public void m4() {
        System.out.println("Derived.m4");
    }
}
