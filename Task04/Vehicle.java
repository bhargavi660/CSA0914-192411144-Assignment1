public class Vehicle {

    String vehicleNo;
    String vehicleType;

    // Default constructor
    Vehicle() {
        this("Unknown", "Not Assigned");
    }

    // Parameterized constructor
    Vehicle(String vehicleNo, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    // Copy constructor
    Vehicle(Vehicle other) {
        this.vehicleNo = other.vehicleNo;
        this.vehicleType = other.vehicleType;
    }

    // Display vehicle details
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle("TN01AB1111", "Car");

        Vehicle v3 = new Vehicle(v2);

        System.out.println("Default Constructor:");
        v1.displayDetails();

        System.out.println("Parameterized Constructor:");
        v2.displayDetails();

        System.out.println("Copy Constructor:");
        v3.displayDetails();
    }
}
