package main.macowin.domain;

import main.macowin.domain.payments.Payment;

import java.time.LocalDate;
import java.util.List;

public class Sale {
    private final List<Garment> garments;
    private final LocalDate date;
    private final Payment payment;

    public Sale(List<Garment> garments, Payment payment){
        this.garments = garments;
        this.payment = payment;
        this.date = LocalDate.now();
    }

    public Sale(List<Garment> garments, Payment payment, LocalDate date){
        this.garments = garments;
        this.payment = payment;
        this.date = date;
    }

    public Double getTotalPrice() {
        Double baseTotalPrice = garments.stream().mapToDouble(Garment::getPrice).sum();
        Double recharge = payment.getRecharge(garments);
        return baseTotalPrice + recharge;
    }

    public Integer getQuantityItems() {
        return garments.size();
    }

    public LocalDate getDate() {
        return date;
    }
}
