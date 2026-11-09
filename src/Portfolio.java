import java.util.ArrayList;

public class Portfolio {

    double balance = 100000;
    ArrayList<String> ownedStocks = new ArrayList<>();
    ArrayList<String> history = new ArrayList<>();

    public void showBalance() {
        System.out.println("\n========== BALANCE ==========");
        System.out.println("Current Balance : ₹" + balance);
    }

    public void buyStock(String stockName, double price) {

        if (balance >= price) {
            balance -= price;
            ownedStocks.add(stockName);
            history.add("Bought : " + stockName + " (₹" + price + ")");
            System.out.println(stockName + " purchased successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void sellStock(String stockName, double price) {

        if (ownedStocks.contains(stockName)) {
            ownedStocks.remove(stockName);
            balance += price;
            history.add("Sold : " + stockName + " (₹" + price + ")");
            System.out.println(stockName + " sold successfully!");
        } else {
            System.out.println("You don't own this stock!");
        }
    }

    public void showPortfolio() {

        System.out.println("\n========== YOUR PORTFOLIO ==========");

        if (ownedStocks.isEmpty()) {
            System.out.println("No Stocks Purchased.");
        } else {
            for (String stock : ownedStocks) {
                System.out.println("• " + stock);
            }
        }
    }

    public void showHistory() {

        System.out.println("\n========== TRANSACTION HISTORY ==========");

        if (history.isEmpty()) {
            System.out.println("No Transactions Yet.");
        } else {
            for (String h : history) {
                System.out.println(h);
            }
        }
    }

    public void showProfitLoss() {

        double profit = balance - 100000;

        System.out.println("\n========== PROFIT / LOSS ==========");

        if (profit > 0) {
            System.out.println("Profit : ₹" + profit);
        } else if (profit < 0) {
            System.out.println("Loss : ₹" + (-profit));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}