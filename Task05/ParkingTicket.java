public class ParkingTicket {

    // Static ticket counter shared by all objects
    static int ticketCounter = 1000;

    // Instance variable
    int ticketNumber;
    String vehicleNo;

    // Static block
    static {
        System.out.println("Parking System Initialized");
    }

    // Constructor
    ParkingTicket(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        ticketNumber = ++ticketCounter;
    }

    // Static method
    static void displayCounter() {
        System.out.println("Current Ticket Counter: " + ticketCounter);
    }

    // Display ticket details
    void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println();
    }

    public static void main(String[] args) {

        ParkingTicket t1 = new ParkingTicket("TN01AB1111");
        ParkingTicket t2 = new ParkingTicket("TN02CD2222");

        System.out.println("Ticket Details:");

        t1.displayTicket();
        t2.displayTicket();

        displayCounter();
    }
}
