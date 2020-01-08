package chapter4;

/**
 * @program mic-public2018
 * @description: 线程安全的懒汉式单例模式
 * @author: sonny
 * @create: 2020/01/04 18:02
 */
public class Single {

    private volatile Single single;

    private Single getInstance(){
        if (null == single) {
            synchronized (Single.class) {
                if (null == single) {
                    return new Single();
                }
            }
        }
        return null;
    }

    private Single(){}
}
