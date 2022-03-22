package Lab08.Part1;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Base {

    //counter for num times m1 is called
    public static int m1Count = 0;

    //Constructor
    public Base() {
        System.out.println("Base Constructor");
    }

    /**
     * Method increments the number of times m1 is called, then prints that value.
     */
    public void m1() {
        m1Count++;
        System.out.println("Number of times m1 was called: " + m1Count);
    }

    /**
     * Method that prints the given string with 'from Base'
     *
     * @param s ; String appended in the print statement
     */
    public void m2(String s) {
        System.out.println(s + " from Base");
    }

}

