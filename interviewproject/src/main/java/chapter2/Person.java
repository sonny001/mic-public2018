package chapter2;

import java.io.Serializable;

/**
 * @program mic-public2018
 * @description: 人
 * @author: sonny
 * @create: 2020/01/01 16:22
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 7930811721983025379L;
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

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
