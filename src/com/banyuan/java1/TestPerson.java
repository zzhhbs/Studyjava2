package com.banyuan.java1;

public class TestPerson {
    public static void main(String[] args) {
        /*如果是同一个包下面 就不需要到包
        *  创建对象
        * 对象名  引用 = new  对象名();
        * */
        //创建对象
        Person person = new Person();
        //调用属性并给属性赋值
        //引用.属性名    引用.方法名();
        person.age=22;
        person.name="孙悟空";
        person.show();
       /* person.name="猪八戒";
        person.show();*/

       Person person1 =new Person();
       person1.name="猪八戒";
       person1.show();

       Person person2 = new Person();
       person2=person;

        person2.name="sha";
        person2.show();
    }
}
