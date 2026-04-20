public class Car {
    private String code;
    private String route;
    private int numberOfPassengers;

    public Car(String code, String route, int numberOfPassengers){
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

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route = route;
    }

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
