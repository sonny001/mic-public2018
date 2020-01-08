package chapter6;

/**
 * @program microservice-project
 * @description: 支付测试
 * @author: sonny
 * @create: 2019/12/30 21:48
 */
public class PaymentDemo {

    public static void main(String[] args) {
//        Payment payment = new ThirdPayment();
//        System.out.println(payment.pay("sonny"));

        DynamicProxy dynamicProxy = new DynamicProxy();
        Payment payment = new ThirdPayment();
        Payment paymentProxy =(Payment)dynamicProxy.bind(payment);
        paymentProxy.pay("123");


    }
}
