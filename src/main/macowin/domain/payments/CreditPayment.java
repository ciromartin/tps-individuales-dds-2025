package main.macowin.domain.payments;

import main.macowin.domain.Garment;

import java.util.List;

public class CreditPayment implements Payment {

    private final Integer quotes;
    private final Double coefficientQuotes;
    private final Double rechargeItem;

    public CreditPayment(Integer Quotes, Double coefficientQuotes){
        this.quotes = Quotes;
        this.coefficientQuotes = coefficientQuotes;
        rechargeItem = 0.01;
    }
    @Override
    public Double getRecharge(List<Garment> garments) {
        Double rechargeByQuotes = quotes * coefficientQuotes;
        Double rechargeByItems = garments.stream().mapToDouble(g -> g.getPrice() * rechargeItem).sum();
        return rechargeByQuotes + rechargeByItems;
    }
}
