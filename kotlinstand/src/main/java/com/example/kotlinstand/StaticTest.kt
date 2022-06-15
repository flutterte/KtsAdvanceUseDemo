package com.example.kotlinstand

class StaticTest {

    companion object{
        public const val VERSION = "1.0.0"
        fun getVersion(): String = VERSION
        /*

        jvmstatic的作用是添加到StaticTest的方法上作为静态方法，以及伴生对象方法，
        如果不加，java反射会发现实际上是compaion的对象成员而非静态成员
         */
        @JvmStatic
        fun test3():String{
            return VERSION+"STATIC"
        }
    }
    fun test(){

    }
    /*
    nly members in named objects and companion objects can be annotated with '@JvmStatic'

     */
//    @JvmStatic
    fun test1(){

    }
}

/**
 * data class 顾名思义 必须有一个有参数的构造，否则 就失去了data clsss的意义了
 *
 */
data class DataCls(val name: String) {

}

/**
 * object 命名的所有皆为静态
 */
object ObjectEmblishA{
  val  name:String="hello"
    fun test(){

    }

    /**
     *
     * JvmStatic 只可以修饰在object或者 class的伴生里面
     */
    @JvmStatic
    fun test1():String{
        return "hhh"
    }


}

fun main(args:Array<String>):Unit{
    val cls=DataCls("hello")
    print("datacls${cls.name}")
    print("object static ${ObjectEmblishA.name} ${ObjectEmblishA.test()}")//object 修饰皆为静态
    print("static method ${StaticTest.getVersion()} static field ${StaticTest.VERSION} ")

}