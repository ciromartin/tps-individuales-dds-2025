package main.macowin.domain.states;

public class NewState implements State {
    @Override
    public Double getPrice(Double basePrice) {
        return basePrice;
    }
}
