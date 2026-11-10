class BaseVehicle {

    String vehicleNo;

    BaseVehicle(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    double calculateFee(int hours) {
        return hours * 20;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BaseVehicle)) {
            return false;
        }

        BaseVehicle other = (BaseVehicle) obj;
        return vehicleNo.equals(other.vehicleNo);
    }

    @Override
    public int hashCode() {
        return vehicleNo.hashCode();
    }
}

class Car extends BaseVehicle {

    Car(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class TwoWheeler extends BaseVehicle {

    TwoWheeler(String vehicleNo) {
        super(vehicleNo);
    }

    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
}

public class Vehicle {

    public static void main(String[] args) {

        BaseVehicle v1 = new Car("TN01AB1111");
        BaseVehicle v2 = new TwoWheeler("TN02CD2222");
        BaseVehicle v3 = new Car("TN01AB1111");

        System.out.println("Car Parking Fee: Rs. " + v1.calculateFee(3));
        System.out.println("Two-Wheeler Parking Fee: Rs. " + v2.calculateFee(3));

        System.out.println("\nVehicle Details:");
        System.out.println(v1);

        System.out.println("\nComparing Vehicles:");
        System.out.println("Are v1 and v3 equal? " + v1.equals(v3));

        System.out.println("Hash Code: " + v1.hashCode());
    }
}
