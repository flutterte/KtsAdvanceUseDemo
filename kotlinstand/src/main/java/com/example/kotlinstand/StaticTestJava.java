package com.example.kotlinstand;

public class StaticTestJava {
    public static void main(String[] args) {
        DataCls cls=new DataCls("hello");
      System.err.print("datacls${cls.name}");
        ObjectEmblishA.getName();
        ObjectEmblishA.test1();
      System.err.print("object static "+ObjectEmblishA.getName()+" ${ObjectEmblishA.test()}");//object 修饰皆为静态吗
      System.err.print("static method ${StaticTest.getVersion()} static field ${StaticTest.VERSION} ");

    }
}
