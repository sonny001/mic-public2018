package chapter7;

/**
 * @program mic-public2018
 * @description: 支付工厂
 * @author: sonny
 * @create: 2020/01/01 10:57
 */
public class PaymentFactory {

    public static PaymentMethod getType(String type){
        switch (type) {
            case "credit":
                return new CreditCard();
            case "debit":
                return new DebitCard();
                default:
                    throw new RuntimeException("type error");

        }

    }
}
