package Lab;

import Lab.Model.House;
import Lab.Model.Town;

/**
 * Main method class for manual testing. Check out the House and Town classes for the code you need to change.
 * There is no need to change anything in this class.
 */
public class Application {
    public static void main(String[] args) {
//      Demonstrating the use of a lombok-generated constructor for the Town class.
        Town t1= new Town(1, "Tampa", "Florida");
        Town t2= new Town(2, "Tampa", "Florida");
        Town t3= new Town(3, "St. Petersburg", "Florida");
//      Demonstrating the use of lombok-generated toString.
        System.out.println("Our towns: ");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
//      Demonstrating the use of lombok-generated setters for the Town class.
        t3.setName("Clearwater");
        System.out.println("The third town has been changed to: ");
        System.out.println(t3);
//      Demonstrating the use of lombok-generated .equals method.
        System.out.println("Are the first and second towns the same?");
        System.out.println(t1.equals(t2));
        System.out.println("Are the first and third towns the same?");
        System.out.println(t1.equals(t3));
//      Now let's test out if you correctly implemented Lombok for the House class.
        System.out.println("Now let's check if House works. House should have a no-args constructor with " +
                "or without Lombok.");
        House h1 = new House();
        h1.id = 1;
        h1.address = "123 florida street";
        h1.bedrooms = 2;
        h1.bathrooms = 2;
        h1.squareFeet = 1400;
        System.out.println("The default ToString will not output the house details. But if Lombok is used to" +
                " implement the ToString, then this output will be more informative: ");
        System.out.println(h1);

    }
}
