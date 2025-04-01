package main.macowin.domain.states;

public class ClearanceState implements State {

    private final Double percentage;

    public ClearanceState (){
        percentage = 0.5;
    }
    @Override
    public Double getPrice(Double basePrice) {
        return basePrice * percentage;
    }
}
