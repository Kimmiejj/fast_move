
import base.Person;
import java.util.Scanner;

public class FastMoveConsoleApplication {
        Person person;

    public FastMoveConsoleApplication (){
        Scanner scn01 = new Scanner(System.in);
        System.out.println("Enter : YourFirstName");
        String name01 = scn01.next();
        Scanner scn02 = new Scanner(System.in);
        System.out.println("Enter : YourLastName");
        String name02 = scn02.next();
        this.person = new Person(name01, name02);
    }
}