package chapter7;

/**
 * @program mic-public2018
 * @description: 策略模式
 * @author: sonny
 * @create: 2020/01/01 13:53
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("皮带",1000));
        bill.addItem(new Item("皮带",1000));

        bill.pay(PaymentFactory.getType("credit"));
    }
}
