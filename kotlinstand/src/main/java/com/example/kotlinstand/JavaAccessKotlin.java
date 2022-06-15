package com.example.kotlinstand;

import java.util.Arrays;

public class JavaAccessKotlin
{
    public static void main(String[] args) {
        System.out.println("Jvmstatic "+StaticTest.test3());
        System.out.println("getVersion "+StaticTest.Companion.getVersion());
        //com.example.kotlinstand.StaticTest$Companion
        System.out.println("cls "+StaticTest.Companion.getClass().getName());
        /*
        methods [public final java.lang.String com.example.kotlinstand.StaticTest$Companion.test3(), public final java.lang.String com.example.kotlinstand.StaticTest$Companion.getVersion()]
         */
        System.out.println("methods "+ Arrays.toString(StaticTest.Companion.getClass().getDeclaredMethods()));
        System.out.println("StaticTest "+ Arrays.toString(StaticTest.class.getDeclaredMethods()));
        /*

        StaticTest [public final void com.example.kotlinstand.StaticTest.test(), public static final java.lang.String com.example.kotlinstand.StaticTest.test3(),
        public final void com.example.kotlinstand.StaticTest.test1()]
         */
        //没加JVMstatic的方法是必须加上Compaion访问的
        //        System.out.println("Jvmstatic "+StaticTest.getVersion());
        System.out.println("version"+StaticTest.VERSION);

    }
}
