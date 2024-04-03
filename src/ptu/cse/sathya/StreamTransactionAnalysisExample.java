package ptu.cse.sathya;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class StreamTransactionAnalysisExample {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Groceries", 55.5),
                new Transaction("Electronics", 200.75),
                new Transaction("Groceries", 30.45),
                new Transaction("Books", 15.65),
                new Transaction("Groceries", 22.75)
        );

        // Filter transactions over 50
        List<Transaction> largeTransactions = transactions.stream()
                .filter(t -> t.getAmount() > 50)
                .collect(Collectors.toList());
        System.out.println("Transactions over 50: " + largeTransactions);

        // Sum of all transaction amounts
        double totalAmount = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total amount of all transactions: " + totalAmount);

        // Group transactions by type
        Map<String, List<Transaction>> transactionsByType = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getType));
        transactionsByType.forEach((type, trans) -> System.out.println(type + ": " + trans));
    }
}
