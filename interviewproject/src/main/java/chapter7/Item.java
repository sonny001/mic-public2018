package chapter7;

/**
 * @program mic-public2018
 * @description: 商品
 * @author: sonny
 * @create: 2020/01/01 10:51
 */
public class Item {

    private int cents;

    private String des;

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Item(String des,int cents) {
        this.cents = cents;
        this.des = des;
    }
}
