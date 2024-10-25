package tasks.task2;

import java.util.Scanner;

public class Main {

    private static final double EUR_RATE = 0.039;
    private static final double GBP_RATE = 0.19;
    private static final double JPY_RATE = 0.12;
    private static final double AUD_RATE = 0.09;
    private static final double USD_RATE = 0.04;

    public static void main(String[] args) {
        CurrencyConverter rubConverter = new CurrencyConverter("RUB");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в RUB: ");


        double amountInRub = scanner.nextDouble();

        String[] currencyCodes = {"EUR", "GBP", "JPY", "AUD", "USD"};
        double[] exchangeRates = {EUR_RATE, GBP_RATE, JPY_RATE, AUD_RATE, USD_RATE};

        for (int i = 0; i < currencyCodes.length; i++) {
            rubConverter.addCurrency(currencyCodes[i], exchangeRates[i]);
        }

        for (String currency : currencyCodes) {
            double convertedAmount = rubConverter.convert(amountInRub, currency);

            System.out.printf("Сумма в %s: %.2f%n", currency, convertedAmount);
        }
    }
}
