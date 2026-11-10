abstract class Vehicle {

    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    abstract void calculateFee();

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

interface Chargeable {
    void chargeBattery();
}

interface Payable {
    void makePayment();
}

class ElectricCar extends Vehicle implements Chargeable, Payable {

    ElectricCar(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    void calculateFee() {
        System.out.println("Parking Fee: Rs. 60");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Electric Car is Charging");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment Completed");
    }
}

class Car extends Vehicle {

    Car(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    void calculateFee() {
        System.out.println("Parking Fee: Rs. 40");
    }
}

public class ParkingSystem {

    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("TN01AB1111");
        Car c = new Car("TN02CD2222");

        System.out.println("Campus Smart Parking System");
        System.out.println("---------------------------");

        e.displayDetails();
        e.calculateFee();
        e.chargeBattery();
        e.makePayment();

        System.out.println();

        c.displayDetails();
        c.calculateFee();
    }
}
