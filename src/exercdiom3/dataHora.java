package exercdiom3;

import java.util.Calendar;
import java.util.Date;

public class dataHora {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data agora: " + data);

        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if (hora> 6 && hora<12){
            System.out.println("Bom dia!");
        }
        if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }

}
