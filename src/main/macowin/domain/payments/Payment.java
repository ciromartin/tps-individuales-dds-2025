package main.macowin.domain.payments;

import main.macowin.domain.Garment;

import java.util.List;

public interface Payment {
    Double getRecharge(List<Garment> garments);
}
