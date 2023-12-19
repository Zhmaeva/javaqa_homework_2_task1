
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 /*
        Задание 1
Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
Формула расчёта следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
Дробные мили не начисляются.
 */
        int ticketPrice = 13_676;
        int bonusMile = 1;
        int milesAccrued = ticketPrice / 20 * bonusMile;

        System.out.println("Вам начислено: " + milesAccrued + " бонусных мили");
    }
}