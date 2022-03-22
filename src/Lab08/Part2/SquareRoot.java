package Lab08.Part2;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class SquareRoot implements OpClass {

    //Constructor
    public SquareRoot() {
    }

    /**
     * Method returns the square-root of 'arg' as a Number
     *
     * @param arg ; Object to be squared
     */
    @Override
    public Object op(Object arg) {
        Number number = (Number) arg;
        float temp = number.floatValue(); //storing arg as a float
        float squareRoot = (float) Math.sqrt(temp); //computing the square root of arg
        Number res = (Number) squareRoot; //storing arg as a Number
        return res;
    }
}
