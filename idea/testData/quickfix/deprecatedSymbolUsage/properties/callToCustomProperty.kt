// "Replace with 'bar'" "true"

val bar get() = 1
@Deprecated("use property instead", ReplaceWith("bar"))
fun foo() = 1
fun test(){
    foo<caret>()
}