public class vehicles {
    public static void main(String[] args) {
        Moped moped = new Moped("Red", 1, 10, 5);
        Car car = new Car("Blue", 5, 500, 50);
        SemiTruck truck = new SemiTruck("White", 2, 10000, 300);
        Hovercraft hovercraft = new Hovercraft("Silver", 4, 1200, 100);

        System.out.println("Moped Color: " + moped.getColor());
        System.out.println("Car Passengers: " + car.getNumberOfPassengers());
        System.out.println("Truck Cargo Capacity: " + truck.getCargoCapacity() + " lbs");
        System.out.println("Hovercraft Fuel: " + hovercraft.getFuelCapacity() + " L");
    }

    
}