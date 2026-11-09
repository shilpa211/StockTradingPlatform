import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock tcs = new Stock("TCS", 3500);
        Stock infosys = new Stock("Infosys", 1800);
        Stock reliance = new Stock("Reliance", 2500);

        Portfolio portfolio = new Portfolio();
        Transaction transaction = new Transaction();

        int choice;

        do {

            System.out.println("\n========== STOCK TRADING PLATFORM ==========");
            System.out.println("1. View Stocks");
            System.out.println("2. Buy TCS");
            System.out.println("3. Buy Infosys");
            System.out.println("4. Buy Reliance");
            System.out.println("5. Sell TCS");
            System.out.println("6. Sell Infosys");
            System.out.println("7. Sell Reliance");
            System.out.println("8. View Portfolio");
            System.out.println("9. Check Balance");
            System.out.println("10. Transaction History");
            System.out.println("11. Profit / Loss");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    tcs.displayStock();
                    infosys.displayStock();
                    reliance.displayStock();
                    break;

                case 2:
                    portfolio.buyStock(tcs.stockName, tcs.price);
                    transaction.buyMessage(tcs.stockName);
                    break;

                case 3:
                    portfolio.buyStock(infosys.stockName, infosys.price);
                    transaction.buyMessage(infosys.stockName);
                    break;

                case 4:
                    portfolio.buyStock(reliance.stockName, reliance.price);
                    transaction.buyMessage(reliance.stockName);
                    break;

                case 5:
                    portfolio.sellStock(tcs.stockName, tcs.price);
                    transaction.sellMessage(tcs.stockName);
                    break;

                case 6:
                    portfolio.sellStock(infosys.stockName, infosys.price);
                    transaction.sellMessage(infosys.stockName);
                    break;

                case 7:
                    portfolio.sellStock(reliance.stockName, reliance.price);
                    transaction.sellMessage(reliance.stockName);
                    break;

                case 8:
                    portfolio.showPortfolio();
                    break;

                case 9:
                    portfolio.showBalance();
                    break;

                case 10:
                    portfolio.showHistory();
                    break;

                case 11:
                    portfolio.showProfitLoss();
                    break;

                case 12:
                    System.out.println("Thank You for Using Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 12);

        sc.close();
    }
}