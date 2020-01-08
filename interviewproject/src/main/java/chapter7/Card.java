package chapter7;

/**
 * @program mic-public2018
 * @description: 支付方式抽象类
 * @author: sonny
 * @create: 2020/01/01 10:34
 */
public  abstract class Card implements PaymentMethod{


    public void pay(int cents) {
        System.out.println("use " +getType()+"topay " + cents +"cents");
        executeTransed(cents);

    }

    public abstract String getType();

    public abstract void executeTransed(int cents);
}
