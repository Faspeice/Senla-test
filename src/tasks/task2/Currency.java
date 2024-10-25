package tasks.task2;

class Currency {
    private final String code;
    private final double exchangeRate;

    public Currency(String code, double exchangeRate) {
        this.code = code;
        this.exchangeRate = exchangeRate;
    }

    public String getCode() {
        return code;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}



