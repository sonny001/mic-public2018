package chapter7;

import java.util.ArrayList;
import java.util.List;

/**
 * @program mic-public2018
 * @description: 购物车
 * @author: sonny
 * @create: 2020/01/01 10:52
 */
public class Bill {

    static List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int getSum(){
        return items.stream().mapToInt(item -> item.getCents()).sum();
    }

    public void pay(PaymentMethod paymentMethod){
        paymentMethod.pay(getSum());
    }
}
