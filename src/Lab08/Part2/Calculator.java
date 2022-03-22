package Lab08.Part2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Calculator {

    //Constructor
    public Calculator() {
    }

    /**
     * Method accepts an Arraylist and OpClass.
     * OpClass's op method is applied to all elements of original Arraylist
     * Returns new Arraylist with new values after op method is applied.
     *
     * @param arrayList ; Original Arraylist of Numbers
     * @param opClass   ; the OpClass Object to apply
     * @return newList ; new Arraylist with new values after op method is applied
     */
    public ArrayList<Number> apply(ArrayList<Number> arrayList, OpClass opClass) {

        //Iterator for Arraylist iteration
        Iterator<Number> it = arrayList.iterator();

        //declaring new ArrayList
        ArrayList<Number> newlist = new ArrayList<>();

        //iterating through original ArrayList
        while (it.hasNext()) {
            Number num = (Number) opClass.op(it.next()); //applying op method to each element
            newlist.add(num); //adding result element into new ArrayList
        }

        return newlist;

    }

    /**
     * Main method for testing program functionality
     *
     * @param args ; An array of Strings
     */
    public static void main(String[] args) {

        //Initializing Number Objects
        Number num1 = 1;
        Number num2 = 2;
        Number num3 = 3;
        Number num4 = 4;
        Number num5 = 5;

        //creating ArrayList of Numbers
        ArrayList<Number> arrayList = new ArrayList<>();

        //adding initialized Numbers to ArrayList
        arrayList.add(num1);
        arrayList.add(num2);
        arrayList.add(num3);
        arrayList.add(num4);
        arrayList.add(num5);

        //Creating Calculator Object
        Calculator calculator = new Calculator();

        //Creating Square Object
        Square square = new Square();

        //Creating new ArrayList res to store squares values of the original 'arrayList'
        ArrayList<Number> res = calculator.apply(arrayList, square);

        System.out.println("Squared Values: ");

        //printing values of res
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        System.out.println();

        //Creating Cube Object
        Cube cube = new Cube();

        //Assigning new ArrayList res to store cubed values of the original 'arrayList'
        res = calculator.apply(arrayList, cube);

        System.out.println("Cubed Values: ");

        //printing values of res
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        System.out.println();

        //Creating SquareRoot Object
        SquareRoot squareRoot = new SquareRoot();

        //Assigning new ArrayList res to store Square rooted values of the original 'arrayList'
        res = calculator.apply(arrayList, squareRoot);

        System.out.println("Square-Rooted Values: ");

        //printing values of res
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

        System.out.println();

    }
}
