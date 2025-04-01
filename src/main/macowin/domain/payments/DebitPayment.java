package main.macowin.domain.payments;

import main.macowin.domain.Garment;

import java.util.List;

public class DebitPayment implements Payment{
    @Override
    public Double getRecharge(List<Garment> garments) {
        return 0.0;
    }
}
