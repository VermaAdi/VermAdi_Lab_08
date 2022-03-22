package Lab08.Part2;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Square implements OpClass {

    //Constructor
    public Square() {
    }

    /**
     * Method squares 'arg' and returns the result as a Number
     *
     * @param arg ; Object to be squared
     */
    @Override
    public Object op(Object arg) {
        Number number = (Number) arg;
        float temp = number.floatValue(); //storing arg as a float
        float square = temp * temp; //squaring arg
        Number res = square; //storing squared arg as a Number
        return res;
    }
}
