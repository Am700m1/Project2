public class Car {
    private String code;
    private Route route;
    private int numberOfPassengers;

    public Car(String code, Route route, int numberOfPassengers){
        this.code = code;
        this.route = route;
        this.numberOfPassengers = numberOfPassengers;
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

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
