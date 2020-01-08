package chapter7;

/**
 * @program mic-public2018
 * @description: 信用卡 支付方式具体实现
 * @author: sonny
 * @create: 2020/01/01 10:39
 */
public class CreditCard extends Card {

    @Override
    public String getType() {
        return "credit";
    }

    @Override
    public void executeTransed(int cents) {
        System.out.println(" doExecuterTranse pay " + cents);

    }
}
