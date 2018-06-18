package InformationExpert;

public class Good {

    private String goodsName;
    private double amount;
    private int priceInCents;
    private int discount;

    public Good(String goodsName, double amount, int priceInCents) {
        this.goodsName = goodsName;
        this.amount = amount;
        this.priceInCents = priceInCents;
    }

    public int getPrice() {
        return priceInCents - discount;
    }

    public double getAmount(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            return amount;
        } else {
            return 0; //
        }
    }

    public double getCurrentAmount(){
        return this.amount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public String getName() {
        return this.goodsName;
    }
}
