package com.example.kotlinstand

class DemoClassMember {
    var name: String = ""
        get() = field
        set(value) {
            if (value == null || value.isEmpty()) {
                field = "无名氏"
            } else {
                field = value
            }
        }
    var age:Int=0
    get()=field
    set(value) {
        if(age>200){
            description="老不死的"
            age=0
        }else if(age<0){
            age=0//直接赋值
            description="巨婴"
        }else{
            field=value//间接赋值
            description="正常人"
        }

    }
    lateinit var description:String//lateinit 顾名思义是不能直接赋值的，不然就不能叫做懒加载了
/*    get() = field //懒加载也不支持get set 操作
    set(value) {
        field=value
    }*/
    var sex:Boolean? = null;
    fun printInfo(){
        //如果没有赋值就会报错了  in" kotlin.UninitializedPropertyAccessException: lateinit property description has not been initialized
        print("name $name ,age $age sex $sex description $description")
    }

}