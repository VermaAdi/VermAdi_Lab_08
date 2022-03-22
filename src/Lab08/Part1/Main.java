package Lab08.Part1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Name: Aditya Verma
 * Date: March 22, 2022
 * Description: Lab 08 "Inheritance and Design Patterns" Submission for CS321.
 */
public class Main {
    /**
     * Main method for testing program functionality for Part 1
     *
     * @param args ; An array of Strings
     */
    public static void main(String[] args) {

        //Initializing Base, Derived and Derived2 objects
        Base base = new Base();
        Derived derived = new Derived();
        Derived2 derived2 = new Derived2();

        System.out.println();

        System.out.println("Calling all methods on Base, Derived, and Derived2: ");
        //Calling all methods on the objects
        base.m1();
        base.m1();
        base.m2("Hello");
        System.out.println();

        derived.m1();
        derived.m2("Hello");
        derived.m3();
        System.out.println();

        derived2.m1();
        derived2.m2("Hello");
        derived2.m3();
        derived2.m4();
        System.out.println();

        //Creating an Arraylist for Bases
        ArrayList<Base> arrayList = new ArrayList<>();

        //initializing Base Objects
        Base base1 = new Base();
        Base base2 = new Base();
        Base base3 = new Base();
        Base base4 = new Base();

        //initializing Derived Objects
        Derived derivedOne = new Derived();
        Derived derivedTwo = new Derived();
        Derived derivedThree = new Derived();

        //initializing Derived2 Objects
        Derived2 derived2One = new Derived2();
        Derived2 derived2Two = new Derived2();
        Derived2 derived2Three = new Derived2();

        //adding the initialized objects to the arraylist in an arbitrary order
        arrayList.add(base1);
        arrayList.add(derivedOne);
        arrayList.add(derived2One);
        arrayList.add(derivedTwo);
        arrayList.add(derived2Two);
        arrayList.add(derivedThree);
        arrayList.add(derived2Three);
        arrayList.add(base2);
        arrayList.add(base3);
        arrayList.add(base4);

        System.out.println();

        //creating iterator for iterate 'arrayList'
        Iterator<Base> it = arrayList.iterator();

        System.out.println("Calling m2 on arrayList: ");

        //Iterating through arraylist and calling the m2 function on each element
        while (it.hasNext()) {
            it.next().m2("Hello");
        }

    }

}
