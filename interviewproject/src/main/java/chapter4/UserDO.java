package chapter4;

import java.io.Serializable;

/**
 * @program mic-public2018
 * @description: 用户对象
 * @author: sonny
 * @create: 2020/01/04 17:31
 */
public class UserDO implements Serializable {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
