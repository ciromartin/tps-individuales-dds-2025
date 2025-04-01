package main.macowin.domain.payments;

public class CashPayment implements Payment{
    @Override
    public Double getRecharge(Double baseTotalPrice, Integer quantityItems) {
        return 0.0;
    }
}
