public class NonSubscribersPassengers extends Passenger{
    private boolean discountCoupon;
    private final double discount = 0.1;
    private final String type = "Non Subscriber Passenger";

    public NonSubscribersPassengers(String name, String id, Car reservedCar, String type, double tripCost, boolean discountCoupon, boolean hasDiscount1) {
        super(name, id, reservedCar, tripCost);
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
                }else{
                    setTripCost(car.getRoute().getTripPrice());
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
        return "Name: " + getName();
    }
}
