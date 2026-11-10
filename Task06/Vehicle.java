class BaseVehicle {

    String vehicleNo;

    BaseVehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        System.out.println("Vehicle Constructor Called");
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

class Car extends BaseVehicle {

    int numberOfDoors;

    Car(String vehicleNo, int numberOfDoors) {
        super(vehicleNo);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car Constructor Called");
    }
}

class ElectricCar extends Car {

    int batteryCapacity;

    ElectricCar(String vehicleNo, int numberOfDoors, int batteryCapacity) {
        super(vehicleNo, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar Constructor Called");
    }

    void displayDetails() {
        display();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Vehicle {

    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("TN01AB1111", 4, 75);

        System.out.println("\nElectric Car Details:");
        e.displayDetails();
    }
}
