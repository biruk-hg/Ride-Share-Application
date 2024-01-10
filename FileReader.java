import java.io.*;
import java.util.*;

public class FileReader {
    Scanner input;

    // Method to read user data from a file and return a list of Users
    public ArrayList<Users> getUsers() {
        ArrayList<Users> users = new ArrayList<Users>();
        try {
            File file = new File("users.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    int id = Integer.parseInt(data[1]);
                    String name = data[2];
                    String email = data[3];
                    String phone = data[4];
                    Users user = new Users(id, name, email, phone);
                    users.add(user);
                } else {
                    int id = Integer.parseInt(data[1]);
                    for (Users user : users) {
                        if (user.getID() == id) {
                            if (data[2].equals("name"))
                                user.setName(data[3]);
                            else if (data[2].equals("email"))
                                user.setEmail(data[3]);
                            else if (data[2].equals("phone"))
                                user.setPhone(data[3]);
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return users;
    }

    // Method to read ride data from a file and return a list of Rides
    public ArrayList<Rides> getRides() {
        ArrayList<Rides> rides = new ArrayList<Rides>();
        try {
            File file = new File("rides.txt");
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if (line.startsWith("#"))
                    continue;

                String[] data = line.split(",");
                if (data[0].equals("create")) {
                    int driverID = Integer.parseInt(data[1]);
                    int riderID = Integer.parseInt(data[2]);
                    double fare = Double.parseDouble(data[3]);
                    Rides ride = new Rides(driverID, riderID, fare);
                    rides.add(ride);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rides;
    }

}
