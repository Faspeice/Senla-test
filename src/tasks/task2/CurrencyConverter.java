package tasks.task2;

import java.util.HashMap;
import java.util.Map;

class CurrencyConverter {
    private final String baseCurrencyCode;
    private final Map<String, Currency> currencies = new HashMap<>();

    public CurrencyConverter(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
        currencies.put(baseCurrencyCode, new Currency(baseCurrencyCode, 1.0));
    }

    public void addCurrency(String code, double exchangeRate) {
        if (exchangeRate < 0) {
            throw new IllegalArgumentException("Курс обмена не может быть отрицательным: " + exchangeRate);
        }
        if (code.equals(baseCurrencyCode)) {
            throw new IllegalArgumentException("Нельзя изменить курс для базовой валюты: " + baseCurrencyCode);
        }
        if (currencies.containsKey(code)) {
            throw new IllegalArgumentException("Валюта уже добавлена: " + code);
        }
        currencies.put(code, new Currency(code, exchangeRate));
    }

    public double convert(double amount, String targetCurrencyCode) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма для конвертации не может быть отрицательной: " + amount);
        }
        Currency targetCurrency = currencies.get(targetCurrencyCode);
        if (targetCurrency != null) {
            return amount * targetCurrency.getExchangeRate();
        } else {
            throw new IllegalArgumentException(String.format("Неподдерживаемая валюта: %s", targetCurrencyCode));
        }
    }
}
