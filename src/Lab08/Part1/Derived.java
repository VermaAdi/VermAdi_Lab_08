package Lab08.Part1;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Derived extends Base implements IType {

    //Constructor
    public Derived() {
        System.out.println("Derived Constructor");
    }

    /**
     * m1 method for Derived Class
     */
    public void m1() {
        System.out.println("Derived.m1");
    }

    // m2 method's definition satisfies from Base since
    // Derived extends Base and Base has m2 defined in it.

    /**
     * m3 method for Derived Class
     */
    @Override
    public void m3() {
        System.out.println("Derived.m3");
    }

}
