import main.macowin.domain.Commerce;
import main.macowin.domain.Garment;
import main.macowin.domain.Sale;
import main.macowin.domain.Type;
import main.macowin.domain.payments.CreditPayment;
import main.macowin.domain.payments.DebitPayment;
import main.macowin.domain.states.ClearanceState;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Commerce macowin = new Commerce();

        List<Garment> todayGarments = new ArrayList<>();
        List<Garment> yesterdayGarments = new ArrayList<>();


        todayGarments.add(new Garment("pantalon rojo", 100.0, Type.PANTALON));
        todayGarments.add(new Garment("pantalon azul", 100.0, Type.PANTALON));


        yesterdayGarments.add(new Garment("camisa rota", 80.0, Type.CAMISA, new ClearanceState()));


        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        Sale todaySale = new Sale(todayGarments, new CreditPayment(6, 10.0), today);
        Sale yesterdaySale = new Sale(yesterdayGarments, new DebitPayment(), yesterday);


        macowin.AddSale(todaySale);
        macowin.AddSale(yesterdaySale);

        System.out.printf("Profit for yesterday (%s): $%.2f%n", yesterday, macowin.getProfitByDate(yesterday));

        System.out.printf("Profit for today (%s): $%.2f%n", today, macowin.getProfitByDate(today));
    }
}