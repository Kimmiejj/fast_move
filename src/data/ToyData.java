package data;

import base.Bike;
import base.Location;

import base.Parcel;
import base.ParcelStatus;

import base.Person;

public class ToyData {

    public static Bike[] getBikes() {

        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("BMW", 1000);
        bikes[1] = new Bike("Honda", 500);
        bikes[2] = new Bike("Toyota", 250);

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];

        person [1] = new Person("Thanapat","Trairatpanasan") ;
        person [2] = new Person("Kim","Dekhier") ;
        person [3] = new Person("Big","Onnairkernnnnn") ;

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0]= new Parcel (60,ParcelStatus.DELIVERED,new Location(0, 0));
        parcels[1]= new Parcel (60,ParcelStatus.READY_TO_SHIP,new Location(0, 0));
        parcels[2]= new Parcel (60,ParcelStatus.SHIPPING,new Location(0, 0));
        parcels[3]= new Parcel (60,ParcelStatus.DELIVERED,new Location(0, 0));
        parcels[4]= new Parcel (60,ParcelStatus.READY_TO_SHIP,new Location(0, 0));
        parcels[5]= new Parcel (60,ParcelStatus.SHIPPING,new Location(0, 0));
        parcels[6]= new Parcel (60,ParcelStatus.DELIVERED,new Location(0, 0));
        parcels[7]= new Parcel (60,ParcelStatus.READY_TO_SHIP,new Location(0, 0));
        parcels[8]= new Parcel (60,ParcelStatus.SHIPPING,new Location(0, 0));
        parcels[9]= new Parcel (60,ParcelStatus.DELIVERED,new Location(0, 0));
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
