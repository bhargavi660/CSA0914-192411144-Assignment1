class Vehicle {

    private String vehicleNo;
    private Integer parkingHours;

    public void setVehicleNo(String vehicleNo) {
        if (vehicleNo != null && !vehicleNo.isEmpty()) {
            this.vehicleNo = vehicleNo;
        }
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setParkingHours(int hours) {
        if (hours > 0) {
            this.parkingHours = hours;
        }
    }

    public Integer getParkingHours() {
        return parkingHours;
    }

    public double calculateFee() {
        return parkingHours * 20.0;
    }
}

public class ParkingSystem {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.setVehicleNo("TN01AB1111");
        v.setParkingHours(3);

        System.out.println("Campus Smart Parking System");
        System.out.println("---------------------------");

        System.out.println("Vehicle Number: " + v.getVehicleNo());
        System.out.println("Parking Hours: " + v.getParkingHours());
        System.out.println("Parking Fee: Rs. " + v.calculateFee());

        // Demonstrating invalid input
        v.setParkingHours(-2);

        System.out.println("After Invalid Input:");
        System.out.println("Parking Hours: " + v.getParkingHours());
    }
}
