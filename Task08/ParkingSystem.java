class Vehicle {

    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    double calculateFee(int hours) {
        return hours * 20;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}

class Car extends Vehicle {

    Car(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class TwoWheeler extends Vehicle {

    TwoWheeler(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
}

public class ParkingSystem {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("TN01AB1111"),
            new TwoWheeler("TN02CD2222"),
            new Vehicle("TN03EF3333")
        };

        System.out.println("Campus Smart Parking System");
        System.out.println("---------------------------");

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Parking Fee for 2 hours: Rs. " + v.calculateFee(2));
            System.out.println();
        }
    }
}
