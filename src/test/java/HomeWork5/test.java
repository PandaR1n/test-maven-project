package HomeWork5;

public class test {
    public static void main(String[] args) {
        int startQuantity = 100;
        int monthlyConsumption = 6;
        int storagePricePerKg = 100;
        int totalPayment = 0;
        for (int quantity = startQuantity; quantity > 0; quantity -= monthlyConsumption) {
            totalPayment += storagePricePerKg * quantity;
        }
        System.out.println("Василий должен будет заплатить: " + totalPayment + " рублей.");
    }
}
