import java.util.Scanner;

class Vehicle {
    String company;
    String model;
    double mileage;
    double fuelCapacity;
    double displacement;

    public Vehicle(String company, String model, double mileage, double fuelCapacity, double displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    double userReviews;

    public TwoWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, double userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    boolean airbags;
    boolean powerSteering;
    boolean rainSensingWiper;

    public FourWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                       boolean airConditioner, boolean airbags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airbags = airbags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }
}

 class CR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TwoWheeler[] twoWheelers = new TwoWheeler[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Two Wheeler " + (i + 1) + ":");
            System.out.print("Company: ");
            String company = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();
            System.out.print("Fuel Capacity: ");
            double fuelCapacity = scanner.nextDouble();
            System.out.print("Displacement: ");
            double displacement = scanner.nextDouble();
            System.out.print("Front Brake: ");
            String frontBrake = scanner.next();
            System.out.print("Rear Brake: ");
            String rearBrake = scanner.next();
            System.out.print("Tyre Type: ");
            String tyreType = scanner.next();
            System.out.print("Head Lamp: ");
            String headLamp = scanner.next();
            System.out.print("User Reviews: ");
            double userReviews = scanner.nextDouble();

            twoWheelers[i] = new TwoWheeler(company, model, mileage, fuelCapacity, displacement,
                    frontBrake, rearBrake, tyreType, headLamp, userReviews);
        }

        FourWheeler[] fourWheelers = new FourWheeler[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Four Wheeler " + (i + 1) + ":");
            System.out.print("Company: ");
            String company = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Mileage: ");
            double mileage = scanner.nextDouble();
            System.out.print("Fuel Capacity: ");
            double fuelCapacity = scanner.nextDouble();
            System.out.print("Displacement: ");
            double displacement = scanner.nextDouble();
            System.out.print("Air Conditioner (true/false): ");
            boolean ac = scanner.nextBoolean();
            System.out.print("Airbags (true/false): ");
            boolean airbags = scanner.nextBoolean();
            System.out.print("Power Steering (true/false): ");
            boolean powerSteering = scanner.nextBoolean();
            System.out.print("Rain Sensing Wiper (true/false): ");
            boolean rainSensingWiper = scanner.nextBoolean();

            fourWheelers[i] = new FourWheeler(company, model, mileage, fuelCapacity, displacement,
                    ac, airbags, powerSteering, rainSensingWiper);
        }


        TwoWheeler bestTwoWheeler = (TwoWheeler) findBestVehicle(twoWheelers);


        FourWheeler bestFourWheeler = (FourWheeler) findBestVehicle(fourWheelers);


        System.out.println("\nBest Two-Wheeler:");
        display(bestTwoWheeler);


        System.out.println("\nBest Four-Wheeler:");
       display(bestFourWheeler);
    }

    public static Vehicle findBestVehicle(Vehicle[] vehicles) {
        Vehicle bestVehicle = vehicles[0];
        double bestCostPerKm = calculateCostPerKm(vehicles[0]);

        for (int i = 1; i < vehicles.length; i++) {
            double costPerKm = calculateCostPerKm(vehicles[i]);
            if (costPerKm < bestCostPerKm) {
                bestCostPerKm = costPerKm;
                bestVehicle = vehicles[i];
            }
        }

        return bestVehicle;
    }

    public static double calculateCostPerKm(Vehicle vehicle) {
        double totalAmountPaid = vehicle.fuelCapacity * getFuelPrice();
        return totalAmountPaid / vehicle.mileage;
    }

    public static double getFuelPrice() {
        return 3.0;
    }

    public static void display(Vehicle vehicle) {
        System.out.println("Company: " + vehicle.company);
        System.out.println("Model: " + vehicle.model);
        System.out.println("Mileage: " + vehicle.mileage);

    }
}

