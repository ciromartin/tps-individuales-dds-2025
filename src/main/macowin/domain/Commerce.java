package main.macowin.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commerce {
    private final List<Sale> sales;

    public Commerce(){
        this.sales = new ArrayList<>();
    }

    public void AddSale(Sale sale){
        sales.add(sale);
    }

    public Double getProfitByDate(LocalDate date){
        return sales.stream().filter(sale -> sale.getDate().isEqual(date))
                .mapToDouble(Sale::getTotalPrice)
                .sum();
    }
}
