package Lab08.Part1;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Separate implements IType {

    //Constructor
    public Separate() {
        System.out.println("Separate Constructor");
    }

    /**
     * m1 method for Separate Class
     */
    public void m1() {
        System.out.println("Separate.m1");
    }

    /**
     * m2 method for Separate Class
     *
     * @param s ; String appended in the print statement
     */
    @Override
    public void m2(String s) {
        System.out.println(s + " from Separate");
    }

    /**
     * m3 method for Separate Class
     */
    @Override
    public void m3() {
        System.out.println("Separate.m3");
    }
}
