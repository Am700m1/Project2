import java.util.ArrayList;

public class Main {
    static void main() {
        try {
            Route route1 = new Route("Dammam", "Riyadh", 350);
            Route route2 = new Route("Al-Khobar", "Jubail Industrial City", 120);

            Car car1 = new Car("Sonata353", route1, 4);
            Car car2 = new Car("Accent897", route2, 0);

            ArrayList<Passenger> passengers = new ArrayList<>();
            passengers.add(new SubscribersPassengers("Ammar", "366"));
            passengers.add(new NonSubscribersPassengers("Saud", "555", true));
            passengers.add(new NonSubscribersPassengers("Abdullah", "go/jo", false));
            passengers.add(new SubscribersPassengers("Mohammed", "456"));


            System.out.println("Initial Capacity of the car1 object is: " + car1.getCarCapacity());
            System.out.println("Initial Capacity of the car2 object is: " + car2.getCarCapacity());

            System.out.println("\n-------------------------------------------------------------------");
            passengers.getFirst().reserveCar(car1);
            System.out.println(passengers.getFirst().displayInformation());

            System.out.println("\n-------------------------------------------------------------------");
            passengers.get(1).reserveCar(car1);
            System.out.println(passengers.get(1).displayInformation());

            System.out.println("\n-------------------------------------------------------------------");
            passengers.get(2).reserveCar(car1);
            System.out.println(passengers.get(2).displayInformation());

            System.out.println("\n-------------------------------------------------------------------");
            passengers.get(3).reserveCar(car2);
            System.out.println(passengers.get(3).displayInformation());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
