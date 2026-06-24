// Factory Pattern Example

interface Vehicle {
    void drive();
}


// Concrete classes
class Car implements Vehicle {

    public void drive() {
        System.out.println("Driving a Car");
    }
}


class Bike implements Vehicle {

    public void drive() {
        System.out.println("Driving a Bike");
    }
}


// Factory class
class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if(type.equalsIgnoreCase("car")) {
            return new Car();
        }
        else if(type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}


// Main class
public class FactoryDemo {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.drive();


        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.drive();
    }
}