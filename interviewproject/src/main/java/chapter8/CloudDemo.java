package chapter8;

/**
 * @program mic-public2018
 * @description: 适配器模式测试
 * @author: sonny
 * @create: 2020/01/01 15:51
 */
public class CloudDemo {

    public static void main(String[] args) {
        CloudService cloudService = new CloudService("Ali");
        cloudService.putObject("个人文件");
    }
}
