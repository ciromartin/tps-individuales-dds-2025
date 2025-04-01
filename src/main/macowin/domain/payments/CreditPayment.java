package main.macowin.domain.payments;

public class CreditPayment implements Payment {

    private final Integer quotes;
    private final Double coefficient;
    private final Double rechargeItem;

    public CreditPayment(Integer Quotes, Double coefficient){

        this.quotes = Quotes;
        this.coefficient = coefficient;
        rechargeItem = 0.01;
    }
    @Override
    public Double getRecharge(Double price, Integer totalItems) {
        return (quotes * coefficient) +  (totalItems * rechargeItem);
    }
}
