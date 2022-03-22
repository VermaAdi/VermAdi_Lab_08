package Lab08.Part2;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Cube implements OpClass {

    //Constructor
    public Cube() {
    }

    /**
     * Method cubes 'arg' and returns the result as a Number
     *
     * @param arg ; Object to be squared
     */
    @Override
    public Object op(Object arg) {
        Number number = (Number) arg;
        float temp = number.floatValue(); //storing arg as a float
        float cube = temp * temp * temp; //cubing arg
        Number res = cube; //storing cubed arg as a Number
        return res;
    }
}
