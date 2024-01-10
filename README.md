# Ride-Share-Application
The RideShareApp class serves as the main application for managing users and rides. It uses the FileReader class to read user and ride data from files, then prints the list of users and rides.

The Users class represents a user in a system and contains private fields for user attributes such as ID, name, email, and phone. It has a constructor to initialize these attributes and getter and setter methods to access and modify them. This class is designed to store and manage user information within a program or application.

The Rides class represents a ride in a ride-sharing system and contains private fields for driver ID, rider ID, and fare. It has a constructor to initialize these attributes and getter and setter methods to access and modify them. This class is designed to store information about rides, including the IDs of the driver and rider involved in the ride, along with the fare associated with the ride.

The FileReader class is responsible for reading user and ride data from external files ("users.txt" and "rides.txt" respectively). It utilizes a Scanner to parse the files line by line, skipping lines starting with '#'. For users, it creates User objects based on the file content and updates existing user information if specified. For rides, it creates Ride objects based on the file content. The class returns ArrayLists containing Users and Rides, respectively, representing the data read from the files.

In the RideShareApp class, the user is prompted to enter a driver ID, and the application calculates and displays the total earnings for that specific driver based on the ride data. The class encapsulates functionality related to displaying information about users, rides, and driver earnings.

