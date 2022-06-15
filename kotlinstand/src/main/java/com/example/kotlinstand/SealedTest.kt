package com.example.kotlinstand

sealed class UiOp {
    object Show : UiOp()
    object Hide : UiOp()
    class TranslateX(val px: Float) : UiOp()
    class TranslateY(val px: Float) : UiOp()
}

class View {
    var visibility: Int = VISIBLE
        set(value) {
            println("set visibility ${value}" )
            field=value
        }

    var translationX: Float = 0f
        set(value) {
            println("set translationX ${value}" )
            field=value
        }

    var translationY: Float = 0f
    set(value) {
        println("set tranx ${value}" )
        field=value
    }

    companion object {
        val VISIBLE = 1
        val GONE = 0
    }

}

fun execute(view: View, op: UiOp) = when (op) {
    UiOp.Show -> view.visibility = View.VISIBLE
    UiOp.Hide -> view.visibility = View.GONE
    is UiOp.TranslateX -> view.translationX =
        op.px // 这个 when 语句分支不仅告诉 view 要水平移动，还告诉 view 需要移动多少距离，这是枚举等 Java 传统思想不容易实现的
    is UiOp.TranslateY -> view.translationY = op.px
}

// 先封装一个UI操作列表
class Ui(val uiOps: List<UiOp> = emptyList()) {

    operator fun plus(uiOp: UiOp): Ui {
        val temp= Ui(uiOps + uiOp)
        println("plus ${uiOp} size:"+uiOps.size)
        return temp
    }
}

fun main() {

    val ui = Ui() +
            UiOp.Show +
            UiOp.TranslateX(20f) +
            UiOp.TranslateY(40f) +
            UiOp.Hide

    var view = View()
    ui.uiOps.forEach { execute(view, it) }
//    run(view, ui) // 最终调用

    println("size ${ui.uiOps.size}")
    print("")
}