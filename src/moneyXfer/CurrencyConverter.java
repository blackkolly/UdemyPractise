package moneyXfer;

public class CurrencyConverter {
        double[] exchangedRates = new double[]{63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};


        void setExchangedRates(double[] rates) {
                exchangedRates = rates;

        }
        void updateExchangeRate(int countryIndex, double newVal) {

                exchangedRates[countryIndex] = newVal;
        }
        double getExchangedRate(int countryIndex) {

                return exchangedRates[countryIndex];
        }
        double computeTransferAmount(int countryIndex, double amount) {

                return amount * getExchangedRate(countryIndex);

        }
        void printCurrencies() {

                System.out.println("\nrupee: " + exchangedRates[0]);

                System.out.println("dirham: " + exchangedRates[1]);

                System.out.println("real: " + exchangedRates[2]);

                System.out.println("chilean_peso: " + exchangedRates[3]);

                System.out.println("mexican_peso: " + exchangedRates[4]);

                System.out.println("_yen: " + exchangedRates[5]);

                System.out.println("$australian: " + exchangedRates[exchangedRates.length-1]);

        }


}
