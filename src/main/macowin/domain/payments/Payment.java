package main.macowin.domain.payments;

public interface Payment {
    Double getRecharge(Double baseTotalPrice, Integer quantityItems);
}
