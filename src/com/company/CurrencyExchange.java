package com.company;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("HUF", 124));
        System.out.println(convertCurrency("HUF", 124));

    }
    public static double exchangeCurrency (String currencyID, double value){
       double valueInEuro = value * switch (currencyID)
        {
            case "HUF"-> 328.61;
            case "SEK" -> 10.76;
            case "CAD" -> 1.47;
            default -> 0;
        };
       return valueInEuro;

    }
    public static double convertCurrency (String currencyID, double value){
        double conversionRate = 0;
        if (currencyID.equals("HUF")){
            conversionRate = 328.61;
        }else if (currencyID.equals("SEK")){
            conversionRate = 10.76;
        }else if (currencyID.equals("USD")){
            conversionRate = 1.12;
        }else if (currencyID.equals("CAD")) {
            conversionRate = 1.12;
        }else {
            conversionRate = 0;
        }
        double valueInEuro= value * conversionRate;
        return valueInEuro;
    }
}
