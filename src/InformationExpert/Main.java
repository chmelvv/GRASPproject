package InformationExpert;

import java.util.ArrayList;

public class Main {

    /**
     * Task: calculate order sum value.
     * e.g.
     *  - sausage, 1kg, price = 5.05 $/kg
     *  - eggs 12, price = 0.5 $/egg
     *  - juice, 0.5 L, price = 2.3 $/1L
     *  Sum = ?
     *
     *  Goal: correct use of GRASP`s "Information expert" pattern.
     *
     * */

    public static void main(String[] args) {
        ArrayList<Good> goods = new ArrayList();
        //put initial products data
        goods.add(new Good("Sausage", 143, 505 ) );
        goods.add(new Good("Eggs", 40, 50 ) );
        goods.add(new Good("Apple Juice", 86, 230 ) );

        //Goods amount`s initial check
        printGoodsAmount(goods);

        //calculate order`s sum
        makeOrder(goods);
        System.out.println("expected orderSum = " + (int)(1*505 + 12 * 50+ 0.5*230) );

        printGoodsAmount(goods);
        System.out.println("expected goods amount: \n" +
                (143-1) + "\n" +
                (40-12) + "\n" +
                (86-0.5) + "\n"
        );

        //add temporary discount per eggs
        goods.get(1).setDiscount(10);
        makeOrder(goods);
        printGoodsAmount(goods);

    }

    private static void makeOrder(ArrayList<Good> goods) {
        int orderSum = new OrderItem(goods.get(0), 1).getSum()
                + new OrderItem(goods.get(1), 12).getSum()
                + new OrderItem(goods.get(2), 0.5).getSum();

        System.out.println("actual orderSum = " + orderSum);
    }

    private static void printGoodsAmount(ArrayList<Good> goods) {
        System.out.println();
        for (Good g: goods) {
            System.out.println(g.getName() + " : " + g.getCurrentAmount());
        }
    }
}
