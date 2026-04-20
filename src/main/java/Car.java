public class Car {
    private String code;
    private Route route;
    private int carCapacity;

    public Car(String code, Route route, int carCapacity){
        this.code = code;
        this.route = route;
        this.carCapacity = carCapacity;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public Route getRoute(){
        return route;
    }

    public void setRoute(Route route){
        this.route = route;
    }

    public int getCarCapacity(){
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public String toString(){
        return "Car Code: " + code + " and it has the next route: \n" + route.toString() + "\nand the available number of seats is: " + carCapacity;
    }
}
