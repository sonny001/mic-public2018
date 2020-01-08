package chapter6;

/**
 * @program microservice-project
 * @description:
 * @author: sonny
 * @create: 2019/12/30 21:49
 */
public class PaymentProxy implements Payment {

    private Payment payment = new ThirdPayment();
    PaymentLog paymentLog = new PaymentLog();
    public String pay(String param) {
        paymentLog.msg(param);
        return payment.pay(param);
    }
}
