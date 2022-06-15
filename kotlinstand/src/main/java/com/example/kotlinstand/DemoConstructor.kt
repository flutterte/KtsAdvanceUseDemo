package com.example.kotlinstand

class DemoConstructor {
    constructor() {
        print("ff")
    }
}

class DemoConstructor2 constructor() {
    init {
        print("shit")
    }
}

class DemoConstructor3 constructor(val name: String) {
    init {
        print("shit ${this.name}")
    }
}

class DemoConstructor5(var age:Int) {
    //下面的构造器都需要调用this(xx)  主构造器
    constructor() : this("hh") {
    }

    constructor(name: String) : this(1) {//次构造器name不能是val 为什么？用脑壳想想
        print("shit ${name} ${this.age} 这里 不能直接使用this.name")
    }
    fun test(){

    }
}
