package main.macowin.domain.states;

public class PromotionState implements State {

    private final Double discount;
    PromotionState(Double discount){
        this.discount = discount;
    }
    @Override
    public Double getPrice(Double basePrice) {
        return basePrice - discount;
    }
}
