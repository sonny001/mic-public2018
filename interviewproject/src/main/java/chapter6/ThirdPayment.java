package chapter6;

/**
 * @program microservice-project
 * @description: 三方支付
 * @author: sonny
 * @create: 2019/12/30 21:46
 */
public class ThirdPayment implements Payment {


    public String pay(String param) {
        System.out.println(param +"发起三方支付");
        return "success";
    }
}
