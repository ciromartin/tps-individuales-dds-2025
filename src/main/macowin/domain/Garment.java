package main.macowin.domain;

import main.macowin.domain.states.NewState;
import main.macowin.domain.states.State;

public class Garment {
    private final String name;
    private final Double basePrice;
    private final Type type;
    private State state;

    public Garment(String name, Double basePrice, Type type){
        this.name = name;
        this.basePrice = basePrice;
        this.type = type;
        this.state = new NewState();
    }

    public Garment(String name, Double basePrice, Type type, State state){
            this.name = name;
            this.basePrice = basePrice;
            this.type = type;
            this.state = state;
    }

    public Double getPrice() {
        return state.getPrice(this.basePrice);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
