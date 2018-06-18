package InformationExpert;

public class OrderItem {

    private final Good good;
    private final double amount;
    int sum;

    public OrderItem(Good good, double amount) {

        this.good = good;
        this.amount = amount;
    }

    public int getSum(){
        return (int) (good.getPrice() * good.getAmount(amount));
    }

}
