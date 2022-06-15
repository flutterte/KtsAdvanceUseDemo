package com.example.kotlinstand


    fun main(args:Array<String>){
        print("xxxxxxx")
        val str:String="a";
        val str2:String="a";
        println("Are the content of a and b the same "+(str==str2))
        println("Are the address of a and b the same? "+(str===str2))//结果还是一样的，字面值常量
     val demo=DemoClassMember()
        demo.age=15 //不赋值age等于也不会赋值 description 就会引发 访问懒加载异常UninitializedPropertyAccessException
        demo.name="阿香"
        demo.printInfo()


    }