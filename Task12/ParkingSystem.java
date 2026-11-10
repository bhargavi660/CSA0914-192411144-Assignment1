import java.time.LocalDate;

abstract class Vehicle {

    String vehicleNo;

    Vehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    abstract double calculateFee(int hours, int entryHour);
}

class Car extends Vehicle {

    Car(String vehicleNo) {
        super(vehicleNo);
    }

    double calculateFee(int hours, int entryHour) {
        return hours * 30.0;
    }
}

class ElectricBike extends Vehicle {

    ElectricBike(String vehicleNo) {
        super(vehicleNo);
    }

    double calculateFee(int hours, int entryHour) {
        return 25.0;
    }
}

class DeliveryVan extends Vehicle {

    DeliveryVan(String vehicleNo) {
        super(vehicleNo);
    }

    double calculateFee(int hours, int entryHour) {

        if (entryHour >= 9 && entryHour < 17) {
            return hours * 60.0;
        }

        return hours * 30.0;
    }
}

class VisitorPass {

    LocalDate issueDate;

    VisitorPass() {
        issueDate = LocalDate.now();
    }

    boolean isValid() {
        return LocalDate.now().equals(issueDate);
    }
}

class ParkingFacility {

    Vehicle[][] floors;

    ParkingFacility(int[] slotsPerFloor) {

        floors = new Vehicle[slotsPerFloor.length][];

        for (int i = 0; i < slotsPerFloor.length; i++) {
            floors[i] = new Vehicle[slotsPerFloor[i]];
        }
    }

    void parkVehicle(Vehicle v) {

        for (int f = 0; f < floors.length; f++) {

            for (int s = 0; s < floors[f].length; s++) {

                if (floors[f][s] == null) {
                    floors[f][s] = v;

                    System.out.println(v.vehicleNo +
                        " parked on Floor " + (f + 1) +
                        ", Slot " + (s + 1));

                    return;
                }
            }
        }

        System.out.println("Parking Full");
    }

    void displayCapacity() {

        System.out.println("\nParking Floor Capacities:");

        for (int i = 0; i < floors.length; i++) {
            System.out.println("Floor " + (i + 1) +
                ": " + floors[i].length + " slots");
        }
    }
}

public class ParkingSystem {

    public static void main(String[] args) {

        int[] slots = {20, 25, 30, 35, 40};

        ParkingFacility parking = new ParkingFacility(slots);

        System.out.println("Campus Smart Parking System");
        System.out.println("---------------------------");

        Vehicle bike = new ElectricBike("TN01AB1111");
        Vehicle van = new DeliveryVan("TN02CD2222");
        Vehicle car = new Car("TN03EF3333");

        System.out.println("\nVehicle Allocation:");

        parking.parkVehicle(bike);
        parking.parkVehicle(van);
        parking.parkVehicle(car);

        System.out.println("\nParking Fee Calculation:");

        System.out.println("Electric Bike Fee: Rs. " +
            bike.calculateFee(3, 10));

        System.out.println("Delivery Van Fee (10 AM): Rs. " +
            van.calculateFee(3, 10));

        System.out.println("Car Fee: Rs. " +
            car.calculateFee(3, 10));

        System.out.println("\nVisitor Pass:");

        VisitorPass pass = new VisitorPass();

        if (pass.isValid()) {
            System.out.println("One-Day Visitor Pass is Valid");
        } else {
            System.out.println("Visitor Pass Expired");
        }

        parking.displayCapacity();
    }
}
