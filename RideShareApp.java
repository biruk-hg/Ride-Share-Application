import java.io.*;
import java.util.*;

public class RideShareApp {
    private static ArrayList<Users> users;
    private static ArrayList<Rides> rides;

    public static void main(String[] args) {
        // Initialize FileReader to read user and ride data from files
        FileReader fileReader = new FileReader();
        users = fileReader.getUsers();
        rides = fileReader.getRides();

        // Print the list of users and rides
        printUsers();
        printRides();

        // Prompt the user for a driver ID and display the total earnings for that driver
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a driver ID: ");
        int driverID = input.nextInt();
        System.out.println("The driver with ID " + driverID + " earned: $" + getEarningByDriver(driverID));
    }

    // Method to print the list of users
    public static void printUsers() {
        System.out.println("Here is the list of users:");
        for (Users user : users)
            System.out.println(user.getID() + "," + user.getName() + "," + user.getEmail() + "," + user.getPhone());
        System.out.println();
    }

    // Method to print the list of rides
    public static void printRides() {
        System.out.println("Here is the list of rides:");
        for (Rides ride : rides)
            System.out.println(ride.getDriverID() + "," + ride.getRiderID() + "," + ride.getFare());
        System.out.println();
    }

    // Method to calculate the total earnings for a given driver
    public static double getEarningByDriver(int driverID) {
        double sum = 0;
        for (Rides ride : rides)
            if (ride.getDriverID() == driverID)
                sum += ride.getFare();
        return sum;
    }
}
