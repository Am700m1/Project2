public class SubscribersPassengers extends Passenger{
    private final double discount = 0.5;
    private final String type = "Subscriber Passenger";

    public SubscribersPassengers(String name, String id, Car reservedCar, double tripCost) {
        super(name, id, reservedCar, tripCost);
    }

    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }


    public double getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getCarCapacity() > 0) {
                super.setReservedCar(car);
                setTripCost((car.getRoute().getTripPrice() - car.getRoute().getTripPrice() * 0.5));
                car.setCarCapacity(car.getCarCapacity() - 1);
            } else {
                throw new Exception("Sorry, there is no space left in this car!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String displayInformation() throws NullPointerException{
        return "Name: " + getName() + " - " + type + " reserved a car with the next information\n" + getReservedCar().toString();
    }
}

