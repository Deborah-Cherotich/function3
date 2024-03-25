fun main(args: Array<String>) {
    words("Barnie bakes brown bagels and buns")


    var x =numbers(10,20,10)
    println(x)
    var p =counting(3,2,1)
    println(p)
    var t = numbers2(20,20,20)
    println(t)
    volOfSphere(3.14159,2.2)

    var u = isPalindrome("school")
    println(u)
}





fun words(sentence:Int){
    var word=words.split([0], [2],[3],[4])
    println(word)


}

fun numbers(num1:Int,num2:Int,num3:Int):Int{
    var add=num1+num2+num3
    return add



}
fun counting(a:Int,b:Int,c:Int):Int{
    var num = counting.count()
    return num
}

fun numbers2(x:Int,y:Int,z:Int):Int{
    var avarage=(x+y+z)/3

    return avarage
}
fun volOfSphere(k:Double,l:Double){
    var volume = 4/3 *k *l
    println(volume)
}
fun isPalindrome(word:String):Boolean{
    if(word=="palindrome")
        return true
    else{
        return false
    }

}