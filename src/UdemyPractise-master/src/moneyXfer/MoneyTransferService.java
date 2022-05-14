package moneyXfer;

public class MoneyTransferService extends CurrencyConverter{
    CurrencyConverter cc = new CurrencyConverter();

    double computeTransferAmount(int countryIndex, double amount) {

        return cc.computeTransferAmount(countryIndex, amount);
    }
    double computeTransferFee(int countryIndex, double amount) {
        double transferAmountFee = cc.computeTransferAmount(countryIndex, amount);
        double transferFee = transferAmountFee * 0.02;
        return transferFee;
    }


    public static void main(String[] args) {

        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

    }
}
