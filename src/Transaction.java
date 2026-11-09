public class Transaction {

    public void buyMessage(String stockName) {
        System.out.println("================================");
        System.out.println("Transaction Successful");
        System.out.println("Bought : " + stockName);
        System.out.println("================================");
    }

    public void sellMessage(String stockName) {
        System.out.println("================================");
        System.out.println("Transaction Successful");
        System.out.println("Sold : " + stockName);
        System.out.println("================================");
    }
}