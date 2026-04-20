public class NonSubscribersPassengers extends Passenger{
    private boolean discountCoupon;
    private final double discount = 0.1;
    private final String type = "Non Subscriber Passenger";

    public NonSubscribersPassengers(String name, String id, Car reservedCar, String type, double tripCost, boolean discountCoupon) {
        super(name, id, reservedCar, tripCost);
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribersPassengers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getCarCapacity() > 0) {
                if(discountCoupon) {
                    super.setReservedCar(car);
                    setTripCost((car.getRoute().getTripPrice() - car.getRoute().getTripPrice() * 0.1));
                    car.setCarCapacity(car.getCarCapacity() - 1);
                }else{
                    super.setReservedCar(car);
                    setTripCost(car.getRoute().getTripPrice());
                    car.setCarCapacity(car.getCarCapacity() - 1);
                }
            } else {
                throw new Exception("Sorry, there is no space left in this car!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String displayInformation() {
        if(discountCoupon) {
            return "Name: " + getName() + " - " + type + ", have a Discount! Reserved a car with the next information\n" + getReservedCar().toString();
        }else{
            return "Name: " + getName() + " - " + type + ", does not have a Discount! Reserved a car with the next information\n" + getReservedCar().toString();
        }
    }
}
