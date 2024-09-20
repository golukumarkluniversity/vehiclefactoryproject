import java.util.Scanner;

public class VehicleFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of vehicle (Car, Truck, Bike): ");
        String vehicleType = scanner.nextLine();
        scanner.close();

        
        Vehicle vehicle = vehicleFactory.getVehicle(vehicleType);

        
        if (vehicle != null) {
            vehicle.drive();
        } else {
            System.out.println("This type of vehicle is not available!");
        }
    }
}
