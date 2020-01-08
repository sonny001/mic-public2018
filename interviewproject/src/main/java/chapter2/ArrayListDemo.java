package chapter2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program mic-public2018
 * @description:
 * @author: sonny
 * @create: 2020/01/01 16:22
 */
public class ArrayListDemo {



    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person person1 = new Person(1L,"sonny");
        Person person3 = new Person(1L,"sonny");

        Person person2 = new Person(2L,"tom");
        Person person4 = new Person(1L,"sonny");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        System.out.println(personList.toString());


//        removeObj2(personList,1L);
        removeObj(personList,1L);
        System.out.println(personList.toString());
    }

    private  static void removeObj(List<Person> personList,Long param){
        Iterator<Person> personIterator=  personList.iterator();
        while (personIterator.hasNext()){
            Person person= personIterator.next();
            if (  person.getId().equals(1L)){
                personIterator.remove();

            }
        }


    }
    private  static void removeObj2(List<Person> personList,Long param){
        for (Person person:personList
             ) {

            if (  person.getId().equals(1L)){
                personList.remove(person);

            }
        }


    }






}
