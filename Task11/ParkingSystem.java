class Vehicle {

    String vehicleNo;
    String vehicleType;

    Vehicle(String vehicleNo, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    double calculateFee(int hours) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return hours * 30.0;
        } else {
            return hours * 10.0;
        }
    }
}

class ParkingFacility {

    Vehicle[] slots;

    ParkingFacility(int capacity) {
        slots = new Vehicle[capacity];
    }

    void parkVehicle(Vehicle v) {

        for (int i = 0; i < slots.length; i++) {

            if (slots[i] != null &&
                slots[i].vehicleNo.equals(v.vehicleNo)) {
                System.out.println("Duplicate vehicle rejected");
                return;
            }
        }

        for (int i = 0; i < slots.length; i++) {

            if (slots[i] == null) {
                slots[i] = v;
                System.out.println(v.vehicleNo +
                    " parked in slot " + (i + 1));
                return;
            }
        }

        System.out.println("Parking Full");
    }

    void removeVehicle(String vehicleNo, int hours) {

        if (hours < 0) {
            System.out.println("Invalid parking duration");
            return;
        }

        for (int i = 0; i < slots.length; i++) {

            if (slots[i] != null &&
                slots[i].vehicleNo.equals(vehicleNo)) {

                double fee = slots[i].calculateFee(hours);

                System.out.println("Vehicle: " + vehicleNo);
                System.out.println("Parking Fee: Rs. " + fee);

                slots[i] = null;
                System.out.println("Parking slot released");
                return;
            }
        }

        System.out.println("Vehicle not found");
    }
}

public class ParkingSystem {

    public static void main(String[] args) {

        ParkingFacility parking = new ParkingFacility(2);

        System.out.println("Campus Smart Parking System");
        System.out.println("----------------------------");

        // Normal vehicle entry
        parking.parkVehicle(
            new Vehicle("TN01AB1111", "Car"));

        parking.parkVehicle(
            new Vehicle("TN02CD2222", "TwoWheeler"));

        // Duplicate vehicle test
        parking.parkVehicle(
            new Vehicle("TN01AB1111", "Car"));

        // Parking full test
        parking.parkVehicle(
            new Vehicle("TN03EF3333", "Car"));

        System.out.println("\nVehicle Exit:");

        // Normal exit
        parking.removeVehicle("TN01AB1111", 3);

        // Zero-duration test
        parking.removeVehicle("TN02CD2222", 0);

        // Invalid slot/vehicle test
        parking.removeVehicle("UNKNOWN", 2);

        // Invalid duration test
        parking.removeVehicle("TN03EF3333", -1);
    }
}
