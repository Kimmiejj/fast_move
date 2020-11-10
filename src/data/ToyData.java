package data;

import base.Bike;
import base.Parcel;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
       
//        Person a = new Person("Thanapat","Trairatpanasan") ;
//        Person b = new Person("Kim","Dekhier") ;
//        Person c = new Person("Big","Onnairkernnnnn") ;
//        person [1] = a;
//        person [2] = b;
//        person [3] = c;
        
        person [1] = new Person("Thanapat","Trairatpanasan") ;
        person [2] = new Person("Kim","Dekhier") ;
        person [3] = new Person("Big","Onnairkernnnnn") ;
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
