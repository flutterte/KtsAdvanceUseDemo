package com.example.kotlinstand
interface FuckI{
    fun fuck()
}
interface Animaal :FuckI{
    fun run()
}
class  FuckImpl:FuckI{
    override fun fuck() {//实现必须加override
        println("fucking")
    }

}

class DelegateCls(a:FuckI) :FuckI by a
class DelegateClsC(a:FuckI) :FuckI by a






//属性委托
// 定义包含属性委托的类
class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: Any?): String {
        return "$thisRef, 这里委托了 ${property} 属性"
    }

    operator fun setValue(thisRef: Any?, property:Any?, value: String) {
        println("setValue $thisRef 的 ${property} 属性赋值为 $value")
    }
}

fun main() {
    val a=FuckImpl()
    DelegateCls(a).fuck() //怎么感觉像是方法返回值呢？
    val e = Example()
    println(e.p)     // 访问该属性，调用 getValue() 函数

    e.p = "Runoob"   // 调用 setValue() 函数
    println(e.p)
}