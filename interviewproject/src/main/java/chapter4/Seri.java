package chapter4;

import java.io.*;

/**
 * @program mic-public2018
 * @description: 序列化和反序列化
 * @author: sonny
 * @create: 2020/01/04 17:33
 */
public class Seri {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserDO userDO=new UserDO(1L,"Sonny");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(userDO);
        byte[] bytes=byteArrayOutputStream.toByteArray();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        UserDO readUserDO = (UserDO) objectInputStream.readObject();

        System.out.println(readUserDO);


    }
}
